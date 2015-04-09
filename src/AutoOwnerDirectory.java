import java.util.ArrayList;
import java.util.List;

public class AutoOwnerDirectory {

    private static final int DEFAULT_OPACITY = 10; //длина массивов по умолочанию

    private List<String> listKey; //массив с произвольной размерностью он умеет расширяться при необходимости
    private List<String> listValue; //массив с произвольной размерностью он умеет расширяться при необходимости
    private List<String> listOwner; //массив для автовладельцев

    public AutoOwnerDirectory() {//перегрузка конструктора
        this(DEFAULT_OPACITY); //вообщем если мы не задали начальную длину наших массивов то оно будет равно DEFAULT_OPACITY
    }

    public AutoOwnerDirectory(Integer opacity) {//основной конструктор
        listValue = new ArrayList<String>(opacity); //ну создаём массив с начальной длиной
        listKey = new ArrayList<String>(opacity); //и ещё один массив с начальной длинной
        listOwner = new ArrayList<String>(opacity); // бла бла
    }

    /**
     * Удаление из мультиотображения элемента
     * @param key - ключ
     */
    public void remove(String key) {
        if (key == null) { //ключ не может быть пустым, если он пустой то мы ничего не добавляем
            return;
        }
        if (listKey.contains(key)) { //если есть такой ключ в массиве ключей
            listValue.remove(listKey.indexOf(key)); //удаляем элемент из массива значений
            listOwner.remove(listKey.indexOf(key));
            listKey.remove(key); //удаляем элемент из массива ключей
        }
    }

    /**
     * Добавление нового элемента
     * @param key - ключ
     * @param value - значение
     */
    public void put(String key, String value, String owner) {
        if (value == null) { // значение не может быть пустым
            return;
        }
        if (key == null) { //ключ не может быть пустым
            return;
        }

        if (owner == null) { //владелец
            return;
        }

        if (listKey.contains(key)) { // если есть такой ключ, то обновляем его
            listValue.set(listKey.indexOf(key), value);
            listOwner.set(listKey.indexOf(key), owner);
        } else { //если нету, то добавляем значение в массив значений и ключ в массив ключей
            listValue.add(value);
            listOwner.add(owner);
            listKey.add(key);
        }
    }

    /**
     * находим машину по номеру машины
     * @param key - ключ
     * @return значение
     */
    public String get_by_number(String key) {
        if (key == null) { //по пустому ключу не можем искать
            return null;
        }
        if (listKey.contains(key)) { //если есть такой номер машины
            return listKey.get(listKey.indexOf(key)) +" compared with "+ listValue.get(listKey.indexOf(key))
                    +" and "+ listOwner.get(listKey.indexOf(key)) ; // берём машину по номеру
        } else { //иначе возращаем null
            return null;
        }
    }

    
}
