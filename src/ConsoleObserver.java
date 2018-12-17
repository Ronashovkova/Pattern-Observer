class ConsoleObserver implements Observer {
    public void handleEvent (int temp,int presser){
        System.out.println("Погода змінилась. Температура = "+ temp +", тиск = "+ presser +".");
    }
}
