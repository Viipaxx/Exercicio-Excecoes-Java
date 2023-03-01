# Exercicio-Exceções-Java

Exercício: Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta. Implemente a conta bancária conforme o projeto abaixo:

                            Class (Account)
                            
                            -number: Integer
                            -holder: String
                            -balance: Double
                            -withdrawLimit: Double
                            
                            +deposit(amount: Double): void
                            +withdraw(amount: Double): void
