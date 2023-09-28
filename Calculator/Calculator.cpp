#include <iostream>
using namespace std;

int main() {
    int ch, res, a, b;
    cout << "Hello World, man!\nChoose Action:\n[1] +\n[2] -\n[3] *\n[4] /";
    cin >> ch;
    cout << "Type First Num: ";
    cin >> a;
    cout << "Type Second Num: ";
    cin >> b;
    // Проверка деления на ноль
    if (ch == 4 && b == 0) {
        cout << "Can`t devide by zero.";
        return 0;
    }
    // Выполнение действий в зависимости от выбора пользователя
    switch (ch) {
    case 1:
        res = a + b;
        break;
    case 2:
        res = a - b;
        break;
    case 3:
        res = a * b;
        break;
    case 4:
        res = a / b;
        break;
    }
    // Вывод результата
    cout << "Result is " << res << ".";
    return 0;
}