# demo-layer-di
Start code for demo to show pros and cons of layer. Can also be used to introduce interfaces, decouple the code, show DI basics and Mockito

# Steps for teacher

1. Show that the code actually works, except adding an Item.
2. Let the student clone the repo and verify the app works the same on the local machine.
3. Let the students debug the code and find out that there are actually two instances of InMemoryDataSource. Discuss ways to fix it: only one instance (NO SINGLETON!) and/or decouple AddButtonHandler from InMemoryDataSource.
4. Ask to add a unit test for InMemoryDataSource. That's easy because this class has no dependencies.
5. Ask to add a unit test for RandomItemCreator. That's harder because of the dependency on Random. Extract this depencency to a separate class and retry. 
6. Ask to add a unit test for ItemCollector. That's harder because of the dependency on InMemoryDataSource. Introduce the pros and cons of an interface here and decouple the code by DI. 
7. Ask to add a unit test for the ```bindDataToTable``` method, that's hard because that's a void method.  Build the unit test together by introducing Mockito.
8. Ask to add a unit test for AddButtonHandlder. That's tough because it depends on three classes. Build the unit test together by introducing Mockito. 
9. Show how the code changes when all ```new``` calls are moved upto SwingingItemApp and how that changes the unit tests.
10. Discuss possibilities to remove the ugly new-chaining from the SwingingItemApp.

