# Netbeans 12.3 + JDK 16 + OpenJFX 16

Простий приклад того як у Netbeans 12.3 з JDK 16 сформувати робочий проект JavaFX, за допомогою OpenJFX 16.

## Корисні посилання:

* https://openjfx.io/
* https://openjfx.io/openjfx-docs/
* https://gluonhq.com/products/javafx/

## Як швидко завантажити собі OpenJFX 16?

    wget https://gluonhq.com/download/javafx-16-jmods-linux/ -O openjfx-16_linux-x64_bin-jmods.zip
    wget https://gluonhq.com/download/javafx-16-sdk-linux/ -O openjfx-16_linux-x64_bin-sdk.zip 
    wget https://gluonhq.com/download/javafx-16-javadoc/ -O openjfx-16-javadoc.zip 

## Як додати до Netbeans?

Спочатку кудись розпакувати. Наприклад у /usr/local/lib/openjfx. Маємо директорію javafx-sdk-16.

Tools → Libraries → New Library

Даємо ім'я Java FX 16, додаємо jar з javafx-sdk-16 (але не src.zip!).

## Що ще?

У самому проекті.

* Properties → Libraries → Classpath - додаємо бібліотеку Java FX 16.
* Properties → Libraries → Run - додаємо бібліотеку Java FX 16.
* Properties → Build → Compiling - деактивуємо *Compile on Save*.
* Properties → Run → VM Options - додаємо:

      --add-modules javafx.controls,javafx.fxml

## fxml - пишемо вручну чи чимось редагуємо?

Яке-таке "вручну"? Безумовно редагуємо за допомогою - Java FX Scene Builder. Беремо його у Oracle:

* https://www.oracle.com/java/technologies/javafxscenebuilder-1x-archive-downloads.html

