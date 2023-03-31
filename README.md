# What to do
* Set up the codebase and get familiar how it works
* Learn Google protobuf https://developers.google.com/protocol-buffers

## Pre-requisites
* Java 17
* Ensure that you have set up a local development environment such that debugger is available to you when needed. We 
  recommend 
  * [Intellij Community Edition](https://www.jetbrains.com/idea/) or 
  * [Visual Studio Code](https://code.visualstudio.com/) 
  with [Extension Pack for java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

### Practice
Tic-tac-toe or Xs and Os, is a paper-and-pencil game for two players, X and O, who take turns marking spaces in a 3×3 grid.

The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

Follow the provided hello world rpc process and its UAT test example (com.gs.interviews.uat.rpcapi.handlers.HelloWorldUAT), implement tests to play the Tic-tac-toe game.

__The following tasks need to be completed in order for the game to be functional:__
1. A player can create a new Tic-tac-toe game
2. The second player can join the existing game
3. Each player can place their X or O in turn
4. Each player can query the game result: `WaitMoreJoin`, `Ongoing`, `Win`, `Draw`, `Lose`


### InterviewService/proto
rpc.proto defines the api provided by the service. It has defined 5 rpc apis. HelloWorldRequest is the example api and others are the apis for the practice tasks.

For any proto file change, you should run `./mvnw clean compile` to re-generate the java code for the changes.
  
### InterviewServiceUAT
It contains a user acceptance test example to demo how to write a test for the rest api you provided.
