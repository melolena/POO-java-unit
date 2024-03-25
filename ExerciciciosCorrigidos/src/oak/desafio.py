produtos = []

def cadastrar_produto():
    
    nome = input("Digite o nome do produto: ")
    descricao = input("Digite a descrição do produto: ")
    valor = float(input("Digite o valor do produto: "))
    disponivel = input("O produto está disponível para venda? (sim/não): ").lower()
    
    produto = {
        'nome': nome,
        'descricao': descricao,
        'valor': valor,
        'disponivel': disponivel
    }
    produtos.append(produto)
    listar_produtos()

def listar_produtos():
    print("\nLista de Produtos:")
    for produto in produtos:
        print(f"Nome: {produto['nome']}, Valor: {produto['valor']}")

opcao = ''
while opcao != '2':
    print("\nMenu")
    print("1 - Cadastrar novo produto")
    print("2 - Sair ")
    opcao = input("Escolha uma opção: ")

    if opcao == '1':
        cadastrar_produto()
    elif opcao == '2':
       print("Te vemos na próxima!")
       break
