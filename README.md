# Лабораторная работа №3-4. Перевод текста из книги в код на Java.
### Условие
Разработать модель приложения, которая должна соответствовать принципам SOLID.
В приложении должно присутствовать следующее:
- как минимум два интерфейса и один абстрактный класс (изменения возможны при согласовании с преподавателем).
- переопределенные 2 из 3 методов equals(), toString() и hashCode().
- минимум один перечисляемый тип (enum).
- 2 собственных класса исключений (checked и unchecked), а также обработка исключений этих классов.
- локальный, анонимный и вложенных классов (static и non-static): 2 на выбор.

Исходный текст (файл data.jpg):
[Исходный текст](data.jpg)

### Результаты
- Была разработана диаграмма классов (папка diagram):
[Диаграмма](diagram/diagram.png)
- Диаграмма была согласована с преподавателем.
- Согласно диаграмме и тексту был реализован код на Java (все исходные файлы находятся в src/s367292/lab3).

Скачать openjdk version "17.0.5", после чего склонировать репозиторий, перейти в папку DescribeBook/bin и запустить ./run.sh
```bash
sudo apt install openjdk-17-jdk 
git clone https://github.com/oAnthocyane/DescribeBook.git
cd DescribeBook/bin
sh ./run.sh
```

### Изменение кода

Все исходники лежат в папке src/s367292/lab3.
При изменении их и запуске нужно перейти в корневую папку проекта, запустить файл recompile.sh а затем перейти в bin и запустить файл run.sh.
```bash
sh ./recompile.sh
cd bin
sh ./run.sh
```
