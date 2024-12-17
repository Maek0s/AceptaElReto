/*
Ejercicio en AceptaElReto - P117 (La fiesta aburrida)
Enlace: https://aceptaelreto.com/problem/statement.php?id=117
*/
#include <iostream>
#include <string>

using namespace std;

int main()
{
    int casos;
    
    cin >> casos;
    
    while (casos-- != 0) {
        string str, soy;
        cin >> soy >> str;
        cout << "Hola, " + str + "." << endl;
    }

    return 0;
}
