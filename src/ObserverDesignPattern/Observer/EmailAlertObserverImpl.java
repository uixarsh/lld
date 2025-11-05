package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl (String emailId, StockObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update () {
        sendMail("Product is now in Stock hurry up !");
    }

    private void sendMail (String message) {
        System.out.println("Mail sent to : " + this.emailId);
        // send the actual email to the end user.
    }
}
