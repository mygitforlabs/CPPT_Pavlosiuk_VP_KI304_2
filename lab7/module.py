import sys

def execute():
    nRows = int(input("Введіть розмір квадратної матриці: "))
    filler = input("Введіть символ-заповнювач: ")

    # введення символа заповнювача квадратної матриці і первірка на те, чи він 1
    if len(filler) != 1:
        print("Потрібно ввести лише один символ!")
        sys.exit()

    lst = [[None for j in range(nRows)] for i in range(nRows)]

    # заповнення матриці
    for i in range(nRows):
        for j in range(nRows):
            # Перевірка на парність/непарність стовпця
            if j % 2 == 0:
                lst[i][j] = " "
            else:
                lst[i][j] = filler

    # вивід матриці   
    print("\nЗгенерований список:")
    for i in range(nRows):
        for j in range(nRows):
            print(lst[i][j], end=" ")
        print()

