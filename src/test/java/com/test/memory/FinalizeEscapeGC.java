package com.test.memory;

/**
 * Created by pc on 2016-09-29.
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK=null;
    public static int zz;
    public void isAlive(){
        System.out.println("oh-mygod i'm still alive");


    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("gaga finalize method executed");
        FinalizeEscapeGC.SAVE_HOOK=this;

    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK=new FinalizeEscapeGC();
        SAVE_HOOK=null;//自残啊
        System.gc();//等死吧

        Thread.sleep(500);
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("oh-no i'm dead");
        }

        SAVE_HOOK=null;//自残啊
        System.gc();//等死吧

        Thread.sleep(500);
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("oh-no i'm dead");

        }

    }

}
