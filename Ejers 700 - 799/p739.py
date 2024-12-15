import math

def calcular_minimo_azulejos(casos):
    resultados = []
    for caso in casos:
        W, H, w, h = caso
        # Colocación en horizontal
        azulejos_horizontal = math.ceil(W / w) * math.ceil(H / h)
        print("htz",azulejos_horizontal)
        # Colocación en vertical
        azulejos_vertical = math.ceil(W / h) * math.ceil(H / w)
        print("vtr",azulejos_vertical)
        # El mínimo de ambas colocaciones
        resultados.append(min(azulejos_horizontal, azulejos_vertical))
    return resultados

# Ejemplo de entrada
casos = [
    (4, 3, 2, 1),
    (3, 4, 2, 1),
    (11, 7, 5, 2)
]

# Procesar los casos de prueba
resultados = calcular_minimo_azulejos(casos)
for resultado in resultados:
    print(resultado)
