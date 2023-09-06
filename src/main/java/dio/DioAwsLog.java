package dio;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
/*
Descrição
Neste desafio, você deve criar um programa em Java para realizar o monitoramento e análise de logs gerados na infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços da AWS e realizará uma análise simples desses logs.

Entrada
Linha 1: A quantidade de logs a serem analisados;
Linhas Seguintes: Cada linha terá as informações de log de um determinado serviço AWS, no seguinte:
yyyy-MM-dd HH:mm:ss,{Nome do Serviço AWS},{Log do Evento Registrado Neste Serviço AWS}
Saída
O programa exibirá os resultados da análise, apresentando:

A quantidade de eventos específicos para cada log de serviço AWS lido na Entrada (em ordem de leitura):
Eventos por servico:
{Nome do 1º Serviço AWS}:{Quantidade de Logs do 1º Serviço AWS}
{Nome do 2º Serviço AWS}:{Quantidade de Logs do 2º Serviço AWS}
{Nome do Nº Serviço AWS}:{Quantidade de Logs do Nº Serviço AWS}
O serviço AWS que teve a maior* quantidade de eventos registrados:
Maior:{Nome do Serviço AWS}
O serviço AWS que teve a menor* quantidade de eventos registrados:
Menor:{Nome do Serviço AWS}
* Tenha como verdade que sempre teremos um serviço com maior incidência e outro com menor, ou seja, nunca teríamos um empate. Veja exemplos abaixo.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

3
2023-07-24 10:15:32,EC2,Instance i-12345 started
2023-07-24 10:17:45,EC2,Instance i-67890 stopped
2023-07-24 10:20:11,S3,Bucket example-bucket created
 */

public class DioAwsLog {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantityLogs = scanner.nextInt();
        scanner.nextLine();

        long countNotExist = 1;

        Map<String, Long> eventsByService = new HashMap<>();

        for (int i = 0; i < quantityLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];

            if (!eventsByService.containsKey(servico)) {
                eventsByService.put(servico, countNotExist);
            } else {
                eventsByService.replace(servico, eventsByService.get(servico) + 1);
            }

        }
        System.out.println("Eventos por servico:");

        for (Map.Entry<String, Long> entry : eventsByService.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Long min = eventsByService.values()
                .stream()
                .min(Long::compareTo)
                .get();

        Long max = eventsByService.values()
                .stream()
                .max(Long::compareTo)
                .get();

        for (Map.Entry<String, Long> entry : eventsByService.entrySet()) {
            if (Objects.equals(entry.getValue(), max)) {
                System.out.println("Maior:" + entry.getKey());
            }

        }

        for (Map.Entry<String, Long> entry : eventsByService.entrySet()) {

            if (Objects.equals(entry.getValue(), min)) {
                System.out.println("Menor:" + entry.getKey());
            }

        }

    }

}