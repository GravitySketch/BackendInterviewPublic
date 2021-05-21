# What to do

* Read the provided code, apis, learn the code base and understand what they do and how they work
* Learn Google protobuf https://developers.google.com/protocol-buffers

### Practice
Tic-tac-toe or Xs and Os, is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid.

The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

Follow the provided hello world rpc process and its UAT test example, implement the Tic-tac-toe game for players. It should provide the following functions to allow players to play the game:

1. A player could create a new Tic-tac-toe game.
2. The second player could join the existing game
3. Each player could place their X or O in turn
4. Each player could query the game result: WaitMoreJoin, Ongoing, Win, Draw, Lose


### InterviewService/proto
rpc.proto defines the api provided by the service. It has defined 5 rpc apis. HelloWorldRequest is the example api and others are the apis for the practice tasks.

For any proto file change, you could run `mvn clean compile` to re-generate the java code for the changes.
  
### InterviewServiceUAT
It contains a user acceptance test example to demo how to write a test for the rest api you provided.

# Level of Requirements

### Graduates to Junior level
We expect you to be able to:
* Can learn and understand how Google protobuf works in this project.
* Can read and understand what the example code does.
* Can learn, understand and follow the rest api process flow.
* Can learn, follow the example, and write your own api implementation.

You don't need to implement tasks 1, 2, 3, 4 and the game. You just need to demo the bullet points above.

We expect you to finish those bullet points less than 8 hours.

### Experienced Candidates
We expect you to finish all points in graduate to junior level as well as complete tasks 1, 2, 3, 4 no more than 2 hours time.

# What's next?

### Graduates to Junior level
Tell us if you are confident to meet our expectation or not. If you are, we would move to the next interview and discuss this project with you.

### Experienced Candidates
Submit your code implementation, we will review your code and give you our feedback. We will discuss your code and design with you in the next interview