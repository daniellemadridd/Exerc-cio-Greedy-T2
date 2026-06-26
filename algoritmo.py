def minimizar_paradas(L, D, pontos):
    """
    Determina o menor conjunto de pontos de parada válidos para completar o rally.
    
    Parâmetros:
    L (int/float): Comprimento total da trilha.
    D (int/float): Distância máxima que o veículo consegue viajar por dia.
    pontos (list): Lista com as distâncias dos potenciais pontos de parada.
    
    Retorna:
    list/str: Lista com os pontos onde deve acampar ou mensagem de erro.
    """
    # Inclui a largada (0) e a chegada (L), garantindo que estejam ordenados
    rotas = [0] + sorted(pontos) + [L]
    
    paradas_feitas = []
    posicao_atual_idx = 0  
    n = len(rotas)
    
    i = 0
    while i < n - 1:
        if rotas[i + 1] - rotas[posicao_atual_idx] > D:
            
            if i == posicao_atual_idx:
                return "Impossível continuar!"
            
            paradas_feitas.append(rotas[i])
            posicao_atual_idx = i  
            
        i += 1
        
    return paradas_feitas
