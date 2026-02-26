package factory;

import Stack.*;
import List.*;

public class StackFactory {

    public static <T> stack<T> createStack(int option, int listOption) {

        switch (option) {

            case 1:
                return new arrayList<>();

            case 2:
                return new vectorStack<>();

            case 3:
                if (listOption == 1)
                    return new listStack<>(new singlylinkedlist<>());
                else
                    return new listStack<>(new doublylinkedlist<>());

            default:
                return null;
        }
    }
}