public class Main {
    /**
     *
     * Michael Woodward
     * SER316 Spring 21 Session B
     * @param args
     */

    /**
     * Main starting class of project.
     * @param args Parameters can take in or set to on project.
     */
    public static void main(String[] args) {
        //Beginning of a new world
        System.out.println("A new World has begun!!!");
        World opponent1 = new World();

        //Creating trainers
        Trainer train = new Trainer("Michael");
        Trainer train1 = new Trainer("Denis");

        Trainer train2 = new Trainer(train.createList(), "Michael", 0);
        Trainer train3 = new Trainer(train1.createList(), "Denis", 0);

        //Starting the new world
        opponent1.setNewWorld(train2, train3);

        System.out.println("This is the end of the training simulation");
    }
}
