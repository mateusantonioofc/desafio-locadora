# desafio-locadora

O objetivo deste desafio é criar um sistema de locadora de veículos em Python, permitindo que usuários possam cadastrar veículos, gerenciar clientes, alugar e devolver carros, além de consultar dados sobre os veículos e clientes. 
Você deve implementar um sistema com as seguintes funcionalidades principais:
Cadastro de Veículos

Permitir o cadastro de veículos com informações como:
-Marca
-Modelo
-Ano
-Placa (gerada automaticamente)
-Quilometragem
-Valor da diária

Cadastro de Clientes
-Nome
-Identificador único (gerado automaticamente)

Aluguel de Veículos
-Listar veículos disponíveis para aluguel.
-Selecionar um veículo para alugar, especificando a duração do aluguel em dias.
-Exibir o valor total a ser pago pelo aluguel.
-Salvar a data do aluguel e a data prevista para devolução.

Devolução de Veículos
-Permitir a devolução de veículos alugados.
-Registrar a quilometragem rodada durante o aluguel.
-Verificar se houve atraso na devolução: Aplicar uma multa de 20% no valor da diária para cada dia de atraso.
-Registrar os dados no histórico do cliente.

Consultas e Relatórios
-Listar todos os veículos, com indicação se estão disponíveis ou alugados.
-Filtrar veículos por marca, modelo ou ano.
-Listar todos os clientes cadastrados.
-Consultar o histórico de alugueis de um cliente específico.

Regras e Restrições
-Um veículo só pode ser alugado se estiver disponível.
-Deve-se calcular corretamente o valor total do aluguel, incluindo multas por atraso, se aplicável.
-O sistema deve ser capaz de lidar com entradas inválidas do usuário.

Recomendação
-Utilize a estrutura de classes para organizar o sistema.
-Recomendado usar herança para classes relacionadas a veículos, clientes e funcionalidades gerais do sistema.
Certifique-se de implementar métodos para:
-Cadastrar veículos e clientes.
-Gerar automaticamente a placa e o identificador único do cliente.
-Calcular valores de aluguel e multas.

Crie um menu interativo para acessar as funcionalidades do sistema.
