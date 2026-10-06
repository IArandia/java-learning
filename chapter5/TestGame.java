public class TestGame{
    public static void main(String [] args){
        int numOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();
        Game game = new Game();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        game.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive){
            int guess = gameHelper.getUserInput("enter a number");
            String result = game.checkYourself(guess);
            numOfGuesses ++;
            if(result.equals("kill")){
            isAlive = false;
            System.out.println("you took "+ numOfGuesses + " guesses");
            }  
        }
    }
}
