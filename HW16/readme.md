# Instagram Notification System

The  System is a Java-based implementation that demonstrates the Observer design pattern. It simulates the process of users posting updates on a social media platform and notifying their followers about these updates.

## Components

- `Observer`: An interface that represents any entity that wishes to receive updates.
- `IndiaObserver`:Implementation of the `Observer` interface.
- `PostObserver`: Implementation of the `Observer` interface.
- `StoryObserver`:Implementation of the `Observer` interface.
- `Observable`: An abstract class that represents an observable user profile.
- `InstagramObservable`: An observable class that extends `Observable`. It represents a user of the social media platform.

## Usage

To use the system, create a `InstagramObservable` instance, add `PostObserver`,etc instances as observers, and then post updates via the `InstagramObservable ` instance.