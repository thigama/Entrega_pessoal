algoritmo "Cadastro"
// Entrega Recode
// Thiago da Gama Fernandes

var
nomes:vetor[0..4] de caracter
telefone:vetor[0..4] de real
destino:vetor[0..4] de caracter
op,nome:caracter
i,j,s:inteiro

procedimento inicializa()

inicio
enquanto op<>"3" faca
escreval("----------------------------------------")
escreval("                  MENU                  ")
escreval("----------------------------------------")
escreval("1 - Cadastra Cliente")
escreval("2 - Buscar cliente")
escreval("3 - Sair")
escreval("Opção:")
leia(op)
se op="1" entao
limpatela
se s=10 entao
EscrevaL("Esgotou o limite de cadastros ")
senao
cadastra_cliente()
fimse
fimse
se op="2" entao
limpatela
buscar_cliente()
fimse
se op="3" entao
para i de 0 ate 4 faca
nome[i]<-"x"
fimpara
limpatela
escreval("Obrigado! Volte Sempre!")
fimse
fimenquanto
fimprocedimento

procedimento cadastra_cliente()
inicio
para i de 0 ate 4 faca
se (nomes[i]="") entao
escreva("Nome:")
leia(nomes[i])
escreva("Telefone:")
leia(telefone[i])
escreva("Destino:")
leia(destino[i])
voltar_menu()
s<-s+1
limpatela
fimse
fimpara
escreval("Esgotou o limite de cadastros")
fimprocedimento

procedimento voltar_menu()
inicio
escreva("Voltar para o menu? (S/N)")
leia(op)
se op="S" entao
i<-i+1
limpatela
inicializa()
senao
limpatela
cadastra_cliente()
fimse
fimprocedimento

procedimento buscar_cliente()
inicio
j<-0
escreva("Digite o nome do cliente: ")
leia(nome)
para i de 0 ate 4 faca
se nome=nomes[i] entao
escreval("Nome:",nomes[i])
escreval("Telefone:",telefone[i])
escreval("Destino:",destino[i])
j<-j+i
fimse
fimpara
se j=0 entao
escreval("Cliente inexistente")
fimse
voltar_menu2()
limpatela
fimprocedimento

procedimento voltar_menu2()
inicio
escreva("Voltar para o menu? (S/N)")
leia(op)
se op="S" entao
limpatela
inicializa()
senao
limpatela
busca_cliente()
fimse
fimprocedimento

inicio
inicializa()

fimalgoritmo