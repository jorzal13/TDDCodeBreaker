import static org.junit.Assert.*;

import org.junit.Test;



public class CodeBreakerTest {

	public CodeBreaker codeBreaker;
	public String resultado;

	@Test
	public void ningunValorCoincide() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("3675");
		assertEquals(" ", resultado);
	}

	@Test
	public void unaRaya() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("3245");
		assertEquals(" -", resultado);
	}

	@Test
	public void dosRayas() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("1245");
		assertEquals(" --", resultado);
	}

	@Test
	public void tresRayas() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("8215");
		assertEquals(" ---", resultado);
	}

	@Test
	public void cuatroRayas() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("1298");
		assertEquals(" ----", resultado);
	}

	@Test
	public void unaX() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("2456");
		assertEquals(" x", resultado);
	}
	
	@Test
	public void dosX() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("2156");
		assertEquals(" xx", resultado);
	}
	
	@Test
	public void tresX() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("2186");
		assertEquals(" xxx", resultado);
	}
	
	@Test
	public void valorCorrecto() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("2189");
		assertEquals(" xxxx", resultado);
	}
	
	@Test
	public void unaXTresRayas() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("2891");
		assertEquals(" x---", resultado);
	}
	
	@Test
	public void dosXDosRayas() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("2198");
		assertEquals(" xx--", resultado);
	}
	
	@Test
	public void XrayaX() {
		codeBreaker = new CodeBreaker();
		resultado = codeBreaker.comparar("2819");
		assertEquals(" x--x", resultado);
	}
}
