package in.iqing.testwsdl;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.7.0
//
// Created by Quasar Development at 20/06/2016
//
//---------------------------------------------------


public class Functions
{
    public interface IFunc< Res>
    {
        Res Func() throws Exception;
    }

    public interface IFunc1< T,Res>
    {
        Res Func(T p);
    }

    public interface IFunc2< T1,T2,Res>
    {
        Res Func(T1 p1, T2 p2);
    }

    public interface IAction
    {
        void Action();
    }

    public interface IAction1< T>
    {
        void Action(T p1);
    }
}
