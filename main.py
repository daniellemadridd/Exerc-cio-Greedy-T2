from algoritmo import minimizar_paradas

def rodar_projeto():
    # Dados de teste
    L_corrida = 100 
    D_max = 30      
    pontos_apoio = [20, 40, 50, 70, 80]
    
    resultado = minimizar_paradas(L_corrida, D_max, pontos_apoio)
    
    print("=" * 40)
    print("      RESULTADO:   ")
    print("=" * 40)
    print(f"Resultado: {resultado}")
    print("=" * 40)

if __name__ == "__main__":
    rodar_projeto()