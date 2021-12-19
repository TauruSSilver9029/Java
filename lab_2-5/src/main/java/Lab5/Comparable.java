package Lab5;

public class Comparable implements java.lang.Comparable<Comparable> {
    public String wordFromFile;
    public int numberOfOccurrence;

    public Comparable(String wordFromFile, int numberOfOccurrence) {
        super();
        this.wordFromFile = wordFromFile;
        this.numberOfOccurrence = numberOfOccurrence;
    }

    @Override
    public int compareTo(Comparable arg0) {
        int crunchifyCompare = Integer.compare(arg0.numberOfOccurrence, this.numberOfOccurrence);
        return crunchifyCompare != 0 ? crunchifyCompare : wordFromFile.compareTo(arg0.wordFromFile);
    }

    @Override
    public int hashCode() {
        final int uniqueNumber = 19;
        int textResult = 9;
        textResult = uniqueNumber * textResult + numberOfOccurrence;

        // hasCode(): Повертає хеш-код для цього рядка. Хеш-код для об'єкта String
        // за допомогою арифметики int, де s[i] - i-й символ рядка, n - довжина рядка,
        // та ^ вказує на піднесення до степеня. (Хеш-значення порожнього рядка дорівнює нулю.)
        textResult = uniqueNumber * textResult + ((wordFromFile == null) ? 0 : wordFromFile.hashCode());
        return textResult;
    }

    // Перевизначити: вказує, що оголошення методу призначене для заміни оголошення методу в супертипі.
    // Якщо метод анотується цим типом анотації, потрібні компілятори
    // для створення повідомлення про помилку, якщо не виконується хоча б одна з наступних умов:
    // Метод перевизначає або реалізує метод, оголошений у супертипі.
    // Метод має сигнатуру, еквівалентну перевизначення будь-якому відкритому методу, оголошеному в Object.

    @Override
    public boolean equals(Object Obj) {
        if (this == Obj)
            return true;
        if (Obj == null)
            return false;
        if (getClass() != Obj.getClass())
            return false;
        Comparable other = (Comparable) Obj;
        if (numberOfOccurrence != other.numberOfOccurrence)
            return false;
        if (wordFromFile == null) {
            if (other.wordFromFile != null)
                return false;
        } else if (!wordFromFile.equals(other.wordFromFile))
            return false;
        return true;
    }

}
