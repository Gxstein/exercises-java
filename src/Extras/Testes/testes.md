/**
* Calcula o desconto aplicável a uma compra com base no valor total e no status do cliente.
*
* <p><b>Funcionamento:</b></p>
* O método verifica primeiro o status do cliente. Clientes VIP recebem um desconto
* base de 15%, enquanto clientes regulares recebem 5%. Caso o valor total da compra
* exceda R$ 500,00, um bônus adicional de 5% é somado ao percentual de desconto.
*
* <p><b>Testes Unitários:</b></p>
* Os cenários de teste para esta regra de negócio estão implementados na classe
* {@code CalculadoraDescontoTest}. A cobertura inclui:
* <ul>
*   <li>{@code deveAplicarDescontoVipCorretamente()}: Valida o desconto de 15% (valor < 500).</li>
*   <li>{@code deveAplicarDescontoRegularCorretamente()}: Valida o desconto de 5% (valor < 500).</li>
*   <li>{@code deveAplicarBonusAcimaDeQuinhentos()}: Verifica a soma do bônus de 5% (valor > 500).</li>
*   <li>{@code deveLancarExcecaoParaValorNegativo()}: Garante que a validação de entrada rejeite valores negativos.</li>
* </ul>
*
* @param valorTotal  O valor total da compra em reais. Deve ser maior que zero.
* @param isVip       Booleano que indica se o cliente possui uma assinatura VIP ativa.
* @return O valor final do desconto em reais a ser subtraído da compra.
* @throws IllegalArgumentException se o {@code valorTotal} for menor ou igual a zero.
* @see br.com.empresa.projeto.CalculadoraDescontoTest
  */
  public double calcularDesconto(double valorTotal, boolean isVip) {
  if (valorTotal <= 0) {
  throw new IllegalArgumentException("O valor total deve ser maior que zero.");
  }

  double percentual = isVip ? 0.15 : 0.05;

  if (valorTotal > 500.0) {
  percentual += 0.05;
  }

  return valorTotal * percentual;
  }