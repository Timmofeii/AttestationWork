Описание:
Эта программа на Java предназначена для чтения текста из файла, его разбора на отдельные слова, а затем выполнения
различных операций, таких как подсчет количества слов, отображение слов и их частоты, а также поиск самого длинного
слова в тексте.

Классы:

App: Этот класс содержит метод start(), который запускает процесс разбора текста. Он инициализирует экземпляры классов
MyParser и Counter, вызывает метод разбора и затем выполняет подсчет слов, отображение слов и поиск самого длинного
слова.

Counter: Этот класс предоставляет методы для подсчета слов, отображения слов и их частоты, а также поиска самого
длинного слова.

countWords(String[] arrWord): Подсчитывает количество слов в заданном массиве слов.
mapWords(String[] arrWords): Отображает слова на их частоту в HashMap.
longerWord(Map<String,Integer> maps): Находит самое длинное слово из заданного отображения слов и их частот.
MyParser: Этот класс отвечает за разбор текста из файла.

pars(String file_name): Считывает текст из указанного файла, разбирает его на отдельные слова и возвращает массив слов.
Использование:

Убедитесь, что у вас установлена Java на вашей системе.
Скомпилируйте Java-файлы.
Создайте экземпляр класса App и вызовите метод start(), передав путь к файлу в качестве аргумента.
Программа разберет текст из файла, выполнит указанные операции и отобразит результаты.
Ипользование:
Установите приложение себе на устройство и запустите его в IDEA.
Участники:

Эта программа была написана [timoshaa@gmail.com].


