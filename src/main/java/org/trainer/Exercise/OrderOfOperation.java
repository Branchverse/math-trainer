package org.trainer.Exercise;

public class OrderOfOperation extends Exercise implements Arithmetic {

    private String difficulty;

    public OrderOfOperation(String difficulty) {
        this.difficulty = difficulty.toLowerCase();
    }

    @Override
    public String getDifficulty() {
        return difficulty;
    }

    @Override
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty.toLowerCase();
    }

    @Override
    public int[] getTask() {
        int max = 0, min = 0, rand1, rand2, rand3, sum;

        switch (difficulty) {
            case "beginner":
                max = 10;
                min = 1;
                break;
            case "medium":
                max = 15;
                min = 11;
                break;
            case "hard":
                max = 20;
                min = 16;
                break;
        }

        rand1 = rand.nextInt((max - min) + 1) + min;
        rand2 = rand.nextInt((max - min) + 1) + min;
        rand3 = rand.nextInt((max - min) + 1) + min;
        sum = rand1 + rand2 * rand3;

        return new int[]{rand1, rand2, rand3, sum};
    }

    @Override
    public String getRenderedTask(int[] task) {
        return task[0] + "+" + task[1] + "*" + task[2];
    }

    @Override
    public boolean checkSolution(int[] task, int input) {
        if (task == null || task.length == 0) {
            return false;
        } else {
            return input == task[3];
        }
    }

    @Override
    public int getSolution(int[] task) {
        return task[3];
    }
}