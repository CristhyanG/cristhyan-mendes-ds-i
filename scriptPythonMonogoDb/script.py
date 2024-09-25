from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client['exercicioBD']
collection = db['produtos']

nomeProduto = input("Nome do Produto : ")
tipoProduto = input("tipo de Produto : ")

documento = {"nome": nomeProduto, "Tipo": tipoProduto}
collection.insert_one(documento)



