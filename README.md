# Netbeans 12.3 + JDK 14 + OpenJFX 14

Простий приклад того як у Netbeans 12.3 з JDK 14 сформувати робочий проект JavaFX, за допомогою OpenJFX 14.

## Корисні посилання:

* https://openjfx.io/
* https://openjfx.io/openjfx-docs/
* https://gluonhq.com/products/javafx/

## Як швидко завантажити собі OpenJFX 14?

    wget https://gluonhq.com/download/javafx-14-jmods-linux/ -O openjfx-14_linux-x64_bin-jmods.zip
    wget https://gluonhq.com/download/javafx-14-sdk-linux/ -O openjfx-14_linux-x64_bin-sdk.zip 
    wget https://gluonhq.com/download/javafx-14-javadoc/ -O openjfx-14-javadoc.zip 

## Як додати до Netbeans?

Спочатку кудись розпакувати. Наприклад у /usr/local/lib/openjfx. Маємо директорію javafx-sdk-16.

Tools → Libraries → New Library

Даємо ім'я Java FX 14, додаємо jar з javafx-sdk-16 (але не src.zip!).

## Що ще?

У самому проекті.

* Properties → Libraries → Classpath - додаємо бібліотеку Java FX 14.
* Properties → Libraries → Run - додаємо бібліотеку Java FX 14.
* Properties → Build → Compiling - деактивуємо *Compile on Save*.
* Properties → Run → VM Options - додаємо:

      --add-modules javafx.controls,javafx.fxml

