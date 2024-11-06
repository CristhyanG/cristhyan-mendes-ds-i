try:
    a = int(input("Digite o numerador: "))
    b = int(input("Digite o denominador: "))
except:
    print("Infelizmente estamos com problemas")
else:
    print(f'O resultado é {a/b}')
finally:
    print("Volte sempre")