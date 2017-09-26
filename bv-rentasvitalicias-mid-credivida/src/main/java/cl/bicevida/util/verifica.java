package cl.bicevida.util;

public class verifica {

		public static boolean validarRut(String rut) {
			boolean validacion = false;
			try {
				rut = rut.toUpperCase();
				rut = rut.replace(".", "");
				rut = rut.replace("-", "");
				int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

				char dv = rut.charAt(rut.length() - 1);

				int m = 0, s = 1;
				for (; rutAux != 0; rutAux /= 10) {
					s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
				}
				
				if (dv == (char) (s != 0 ? s + 47 : 75)) {
					validacion = true;
				}
				
				//System.out.println("xx 48 : " + (char) (48));
				//System.out.println("xx 75 : " + (char) (75));
				//System.out.println((char) (s != 0 ? s + 47 : 75) );

			} catch (java.lang.NumberFormatException e) {
			} catch (Exception e) {
			}
			return validacion;
		}

		public static String calculaRut(String rut) {
			String dv="";
			try {
				rut = rut.toUpperCase();
				rut = rut.replace(".", "");
				rut = rut.replace("-", "");
				int rutAux = Integer.parseInt(rut); 


				int m = 0, s = 1;
				for (; rutAux != 0; rutAux /= 10) {
					s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
				}
				
				dv = Character.toString((char) (s != 0 ? s + 47 : 75));
				
			} catch (java.lang.NumberFormatException e) {
			} catch (Exception e) {
			}
			return dv;
		}
}
