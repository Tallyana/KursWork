public class Main {
    public static void main(String[] args) {
        //Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
        String[] array = new String[] {"a", "a", "b", "a", "b", "a", "a", "b", "c", "a", "b", "a", "c", "a","d", "e", "d", };
        System.out.println(deleteDuplicate(array));
    }
    public static String deleteDuplicate(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        array[j] = null;
                    }
                }
                stringBuilder.append(array[i]);
            }
        }
        return stringBuilder.toString();
    }
}
