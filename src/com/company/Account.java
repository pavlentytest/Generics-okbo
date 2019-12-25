package com.company;

public class Account<T,X,B> {

    private T id;
    private X balance;
    Account(T i, X d) {
        this.id = i;
        this.balance =d;
    }

    public B doTTT() {
        return (B) new Object();
    }

    public X getBalance() {
        return balance;
    }

    public T getId() {
        return id;
    }
}
