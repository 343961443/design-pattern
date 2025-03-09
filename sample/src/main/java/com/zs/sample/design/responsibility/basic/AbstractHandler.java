package com.zs.sample.design.responsibility.basic;

public abstract class AbstractHandler {
    public AbstractHandler nextAbstractHandler;
    public void setNextHandler(AbstractHandler nextAbstractHandler) {
        this.nextAbstractHandler = nextAbstractHandler;
    }

    public void handlerRequest() {
        handlerRequestInternal();
        if (nextAbstractHandler != null) {
            nextAbstractHandler.handlerRequest();
        } else {
            System.out.println("处理结束");
        }
    }
    protected abstract void handlerRequestInternal();
}
