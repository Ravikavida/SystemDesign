package com.dsa.systemdesign.threads;

import java.util.concurrent.*;

public class CustomProducerConsumer {

    private static final int QUEUE_CAPACITY = 100;

    public static void main(String args[]){

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);
        ExecutorService service = Executors.newFixedThreadPool(4);

        //producer
        service.execute(() ->{
            int messageId = 1;
            String message = "message_"+messageId++;
            try {
                while(!Thread.currentThread().isInterrupted()) {
                    queue.put(message); // queue.offer(message);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        //consumer
        for(int i=1;i<=3;i++){
            int consumerId = i;
            service.submit(() ->{
                try{
                    while(!Thread.currentThread().isInterrupted()){
                        String message = queue.take();
                        System.out.println(message);
                    }
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            });

        }

    }

}

// put vs offer
    //put -> waits until the space becomes availabe to add message. and maintains natural backpressuer
    //offer -> doesn't wait indefinitly it return false if queue is full we need to write logic like retry, drop,send to DLQ


/*
1. ArrayBlockingQueue
BlockingQueue<String> queue =
        new ArrayBlockingQueue<>(100);

Capacity is fixed at 100.

When it reaches 100:

queue.put(message);

blocks until a consumer removes something.

Producer
   ↓
┌─────────────────┐
│ ArrayQueue      │
│ capacity = 100  │
└────────┬────────┘
         ↓
      Consumer

This gives you strong, predictable backpressure.

2. LinkedBlockingQueue
BlockingQueue<String> queue =
        new LinkedBlockingQueue<>(100);

You can also specify a capacity.

If you do:

new LinkedBlockingQueue<>();

it has a very large theoretical capacity (Integer.MAX_VALUE), so don't assume this provides useful backpressure.

For production, if you want bounded behavior:

new LinkedBlockingQueue<>(100);

Then it behaves as a bounded queue.

Important interview difference: locking

ArrayBlockingQueue uses a single lock for putting and taking.

LinkedBlockingQueue uses separate locks for:

putLock  → producers
takeLock → consumers

This can allow a producer and consumer to operate concurrently in situations where they don't need to contend for the same lock.

So for a workload with many producers and consumers, LinkedBlockingQueue can sometimes provide better throughput.

But don't say:

"LinkedBlockingQueue is always faster."

That's not correct. Performance depends on workload, contention, queue size, and JVM/runtime behavior.

Which one would I choose?

For your interview scenario:

Producer continuously produces → Consumer consumes → need backpressure

I'd say:

BlockingQueue<Message> queue =
        new ArrayBlockingQueue<>(1000);

if I want a fixed-size in-memory buffer and predictable memory usage.

I'd use:

BlockingQueue<Message> queue =
        new LinkedBlockingQueue<>(1000);

when I want the linked implementation and potentially more concurrency between producers and consumers.

Interview answer

"ArrayBlockingQueue is backed by a fixed-size array, so its capacity is fixed and memory usage is predictable. LinkedBlockingQueue is backed by linked nodes and can be bounded by specifying a capacity. Both are thread-safe FIFO blocking queues and support backpressure. For a bounded producer-consumer buffer where I want predictable memory usage, I would typically consider ArrayBlockingQueue."
*/
