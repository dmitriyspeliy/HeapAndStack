package ru.sky.pro;

import java.util.Arrays;

public class Main {
    //task 5
    //если распечатать переменную в методе main, то какое у нее будет значение?
    //значение будет 33, так как внутри методы мы получаем значение перменной, а не ссылку.
    //Даже если мы в методе изменим значение, значение внутри переменной value останется прежним.
    //task 6
    //если распечатать переменную в методе main, то какое у нее будет значение?
    //значение будет 33, так как внутри методы мы получаем значение перменной, а не ссылку.
    //Даже если мы в методе изменим значение, значение внутри переменной value останется прежним.
    //task 7
    //если распечатать массив в методе main, то какие у него будут значения?
    //при попадании в метод переменная value копируется, подавая в качестве аргумента дубликат той ссылки, что есть вне метода.\
    //при ее изменении наша первая ссылка не изменятся, как и в задании 5 и 6. Только там значения, а тут ссылка
    //task 8
    //Тоже самое
    //Task 9
    //Если мы не присваиваем в методе новый объект, а лишь меняем текущий, то поля поменяются конечно
    //Task 9
    //Если мы присваиваем в методе новый объект, ничего не поменятся. В методе создаться новый объект и при компиляции уничтожиться
    // гарбэдж колектором. А первый объект не поменятся.
}
