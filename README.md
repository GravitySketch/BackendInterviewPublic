# What to do before the interview
* Check out the codebase and get familiar how it works such as
  * Google protobuf https://developers.google.com/protocol-buffers
* Set up your local development environment
  * Java 17
  * IDE of your preference such as
    * [Intellij Community Edition](https://www.jetbrains.com/idea/) or
    * [Visual Studio Code](https://code.visualstudio.com/)
      with [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
    * Make sure you can put breakpoints and debug the code using IDE which would help massively, especially for the UAT project

## Useful maven commands
* `./mvnw clean compile` to regenerate code from protobuf definitions and compile the code
* `./mvnw test` to run all the tests

# Task (To be completed during the interview, do not attempt beforehand)
Tic-tac-toe or Xs and Os, is a paper-and-pencil game for two players, X and O, who take turns marking spaces in a 3×3 grid.

The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

Follow the provided hello world rpc process and its UAT test example (com.gs.interviews.uat.rpcapi.handlers.HelloWorldUAT), implement tests to play the Tic-tac-toe game.

__The following tasks need to be completed in order for the game to be functional:__
1. A player can create a new Tic-tac-toe game
2. The second player can join the existing game
3. Each player can place their X or O in turn
4. Each player can query the game result: `WaitMoreJoin`, `Ongoing`, `Win`, `Draw`, `Lose`
