/* 
Ejercicio de AceptaElReto - P191 (Los problemas de ser rico)
Enlace: https://aceptaelreto.com/problem/statement.php?id=191
*/

#include <iostream>
#include <string>

using namespace std;

int main()
{
    int casos;
    cin >> casos;
    
    while (casos-- != 0) {
        int result, contador, litros, diferencia;
        
        cin >> contador >> litros >> diferencia;
        
        result = litros;
        
        for (int i = 1; i < contador; i++) {
            litros -= diferencia;
            result += litros;
        }
        cout << result << endl;
    }
    return 0;
}
