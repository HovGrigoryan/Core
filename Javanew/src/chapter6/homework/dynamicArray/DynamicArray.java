package chapter6.homework.dynamicArray;

public class DynamicArray {

    //    հիմնական մասիվ, որտեղ պահելու ենք ավելացվող մեթոդները
    private int array[] = new int[4];
    //ավելացված էլեմենտների քանակ
    private int size = 0;

    //    ստուգել եթե մասսիվի մեջ տեղ չկա, կանչել extend()
//    և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            extend();
            array[size++] = value;
        } else {
            array[size++] = value;
        }
    }

    //   1․ Ստեղծել  հին մասիվից 10 էլեմենտ ավել մեծ մասիվ
//    2․քցել հին մասիվի էլեմենտները նորի մեջ
//    3․հին մասիվի հղումը կապենք նոր մասիվի հղման հետ
    private void extend() {
        int array1[] = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }


    //    եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
//    մասիվի index - երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return -1;
        }

    }


    //            տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //վերադարձնել ավելացված թվերից ամենամեծը
    public int max() {
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    //վերադարձնել ավելացված թվերից ամենափոքրը
    public int min() {
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    //մասիվից ջնջում ենք եկած ինդեքսի տակ ընկած էլեմենտը, հետո տպելուց մասիվի բոլոր էլեմենտները կտպի իրար կողք, իսկ ջնջվածը ոչ
    public void deleteByIndex(int index) {
        int[] array1 = new int[array.length - 1];
        for (int i = 0, k = 0; i < size; i++) {
            if (i == index) {
                continue;
            }
            array1[k] = array[i];
            k++;
        }

        array = array1;
        size--;


    }

    //մասիվից ջնջում ենք տված value-ին հավասար բոլոր էլեմենտները
    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
            }
        }


    }
    //մասիվից ջնջում ենք տված value-ին հավասար միայն առաջին էլեմենտները։ Այսինքն եթե ասում ենք ջնջի 23 թիվը, ու մասիվում ունենք 2 և ավել 23-ներ, կջնջի միայն առաջինը։
    public void deleteByValueFirst(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
                break;
            }
        }
    }

    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և endIndex-ի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > size || startIndex >= endIndex) {
            System.out.println("սխալ ինդեքսներ");
            return null;
        }
        int[] result = new int[endIndex - startIndex];
        int index = 0;
        for (int i = startIndex; i < endIndex; i++) {
            result[index++] = array[i];
        }
        return result;
    }

    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և մինչև վերջին էլեմենտի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex) {
        if (startIndex < 0 || startIndex >= size) {
            System.out.println("սխալ ինդեքս");
            return null;
        }
        int[] result = new int[size - startIndex];
        int index = 0;
        for (int i = startIndex; i < size; i++) {
            result[index++] = array[i];
        }
        return result;
    }

}








