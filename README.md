## Группа 3530904/90103

    gmreyer - Мишин Александр
    AnasStep - Степаненко Анастасия

# Sprint 1 planning
Начальная стадия разработки. Собираются общие требования по проекту, рассматриваются примеры реального применения выбранного стека технологий, идет начальная сборка материалов. Готовится примерный макет итогового результата.

## Аnalysis
- [x] Готово:
- Выделены командные часы на проект и количество спринтов;
- Рассчитаны часы на исполнителя - общий лимит на исполнителя был превышен (см. выделенное количество часов на проект);
- Выделены задачи на спринт, с приведенной ожидаемой оценкой временных затрат;
- Проведены 2 daily;
- Определен общий концепт игры;
- Создан фон;
- [ ] Не сделано:
- Внутреннее демо;
- Фокус-фактор команды;


## Backlog проекта
Tasks | Hours (ожидаемо) | Hours (на практике)| Executors
------------ | ------------- | ------------- | -------------
изучение материалов предметной области, ведение документации | 2| 4| AnasStep
разработка общего концепта игры, визуализация игрового процесса| 5| 6| gmreyer



# Sprint 2 planning
Финальная стадия разработки. Подводятся итоги работы, формируется финальный отчет по проекту. 

## Аnalysis
- [x] Готово:
- Проведены 2 daily;
- Закончена программная часть игры;
- Проведено предварительное тестирование приложения;
- Завершена работа над визуалом игры;
- Сформирован отчет;
- [ ] Не сделано:
- Контейнеризация Docker;
- Unit-тесты;


## Backlog проекта
Tasks | Hours (ожидаемо) | Hours (на практике)| Executors
------------ | ------------- | ------------- | -------------
подготовка отчета, общее тестирование, подведение итогов проведенной работы | 4| 3| AnasStep
завершение разработки, доведение проекта до требуемого состояния, программная и визуальная части | 8| 6| gmreyer

# Отчет 
## Поставленная задача
На базе JavaFX разработать приложение «Тетрис», в котором у игрока будет возможность манипулировать фигурами.
Попробовать себя в командной разработке и пройти через все этапы разработки, начиная с планирования задач 
и заканчивая еженедельными собраниями с демонстрацией выполнения оных.

## Диаграмма классов

![изображение](https://user-images.githubusercontent.com/71121074/154512817-93b826f2-bf58-459f-93cc-fd209b5effb5.png)

## Описание использованных классов

- Direction – emun класс, который задает положение квадратов, из которых состоит фигура
- Piece – квадрат, составная часть фигуры
- Tetromino – игровые фигуры, в этом классе задается цвет и форма соответствующей фигуры
- TetrisApp – основное приложение, расширяющее класс Application из JavaFX
- Main – класс-обертка для компиляции приложения

## Реализация 

Каждая фигура представляет собой 4 квадрата, объекта класса Piece, хранящихся в 
объекте класса Tetromino. 
При запуске программы инициализируется окно при помощи инструментов JavaFX. 
Затем каждый кадр проверяется состояние падающих фигур. Если фигура находится на 
краю экрана, то программа не допустит дальнейшего ее продвижения в ту же строну. Если 
фигура находится на нижней границе окна или «упала» на существующие фигуры, то мы 
забираем управление этой фигурой у игрока и создаем новую. Также каждый кадр 
отрисовываются уже упавшие фигуры. 
Управление реализовано с использованием клавиш клавиатуры: 
• ↓ (стрелка вниз) – ускорение падения фигуры
• → (стрелка вправо) – сдвиг фигуры вправо
• ← (стрелка влево) – сдвиг фигуры влево
• «пробел» - поворот фигуры по часовой стрелке
Если упавшая фигура находится у верхней границы окна, игра завершается, а само
приложение закрывается.

## Работа приложения

![изображение](https://user-images.githubusercontent.com/71121074/154513115-d4ba4dbe-b7a9-4e2b-a9ae-032b5bb2fc97.png)

Как видно из скриншота, всего может быть 4 цвета фигур, которыми у игрока есть 
возможность управлять. Кроме этого для удобства использования приложения был 
добавлен фон «сетка». Он подчеркивает разметку поля и помогает ориентироваться на нем.
Как в классическом тетрисе у игрока основной целью является «срезание»
заполенных линий на поле. Как только на поле выстраивается линия из квадратиков, эта 
строка исчезает, а все остальные фигуры «опускаются» на высоту «срезанных» линий.
Работа приложения развершается, когда игрок проигрывает, то есть выстраивает 
башню или иными словами доходит до верха поля:

![изображение](https://user-images.githubusercontent.com/71121074/154513255-ebbeca08-ea2c-4f57-bbb4-bd4b19c48297.png)

## Подключенные библиотеки

JavaUtil – вспомогательные классы, широко используемые в других встроенных пакетах 
Java. Набор методов и классов для упрощенной работы с коллекциями, взаимодействия с 
системными функциями низкого уровня, для работы с математическими функциями, 
генерации случайных чисел и манипуляций с датой и временем.

JavaFX - платформа на основе Java для создания приложений с насыщенным графическим 
интерфейсом.

## Вывод

В ходе выполнения поставленных задач мы углубили свои знания в области 
разработки приложений на Java, а также расширили свои навыки владения платформой 
JavaFX, без которой было бы намного сложнее построить подобную графическую игру. 
Во время процесса разработки мы столкнулись с трудностями, связанными с работой 
в команде и распределением обязанностей. Однако некоторые разногласия в нашей группе 
разработчиков не помешали написанию приложения и научили нас более осознанно 
подходить к командной работе, показали нам, что групповая работа по праву является 
наиболее продуктивным способом разработки.
