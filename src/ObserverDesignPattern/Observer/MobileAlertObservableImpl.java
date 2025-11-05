package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObservableImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObservableImpl (String userName, StockObservable observable){
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update () {
        sendMsgOnMobile("Product is now in Stock hurry up !");
    }

    private void sendMsgOnMobile (String message) {
        System.out.println("Message sent to : " + this.userName);
        // send the actual message to the end user.
    }
}
