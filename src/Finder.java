public class Finder {

    private String[] values;

    private String[] keys;

    public Finder() { //конструктор
        values = new String[1];
        keys = new String[1];
    }

    /**
     * устанавливаем массив ключей
     * @param keys
     */
    public void setKeys(String[] keys) {
        this.keys = keys;
    }

    /**
     * устанавливаем массив значений
     * @param values
     */
    public void setValues(String[] values) {
        this.values = values;
    }

    /**
     * поиск подстроки
     * @param substring
     * @return ModelFinder
     */
    public ModelFinder find(String substring) {
        ModelFinder finder = new ModelFinder();
        Long start = System.currentTimeMillis(); //начало выполнения поска
        for (int i = 0; i < values.length; i++) {
           if (values[i] != null && values[i].indexOf(substring) != -1) { //ищем подстроку
               finder.addIndexList(i); //добавляем индекс
           }
        }
        Long end = System.currentTimeMillis(); //конец выполнения поиска
        finder.setTimeFindList(end-start); //считаем время выполения
        System.out.print(end - start);

        start = System.currentTimeMillis(); //начало выполнения поиска
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null && values[i].indexOf(substring) != -1) { //ищем подстроку в значениях
                finder.addIndexMap(i);
            }
            if (keys[i] != null && keys[i].indexOf(substring) != -1) { //ищем подстроку в ключах
                finder.addIndexMap(i);
            }
        }
        end = System.currentTimeMillis(); //конец выполенения поиска
        finder.setTimeFindMap(end - start);
        return finder;
    }
}
