package pythonchallenge;

public class challenge3 {
	public static void main(String args[]) {
		String alphabetL = "abcdefghijklmnopqrstuvwxyz";
		String alphabetU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String decode = "";
		StringBuilder decodeBuilder = new StringBuilder();
		int runs = 0;
		String decodeText = "kAewtloYgcFQaJNhHVGxXDiQmzjfcpYbzxlWrVcqsmUbCunkfxZWDZjUZMiGqhRRiUvGmYmvnJIHEmbTMUKLECKdCthezSYBpIElRnZugFAxDRtQPpyeCBgBfaRVvvguRXLvkAdLOeCKxsDUvBBCwdpMMWmuELeGENihrpCLhujoBqPRDPvfzcwadMMMbkmkzCCzoTPfbRlzBqMblmxTxNniNoCufprWXxgHZpldkoLCrHJqvYuyJFCZtqXLhWiYzOXeglkzhVJIWmeUySGuFVmLTCyMshQtvZpPwuIbOHNoBauwvuJYCmqznOBgByPwTDQheAbsaMLjTmAOKmNsLziVMenFxQdATQIjItwtyCHyeMwQTNxbbLXWZnGmDqHhXnLHfEyvzxMhSXzdBEBaxeaPgQPttvqRvxHPEOUtIsttPDeeuGFgmDkKQcEYjuSuiGROGfYpzkQgvcCDBKrcYwHFlvPzDMEkMyuPxvGtgSvWgrybKOnbEGhqHUXHhnyjFwSfTfaiWtAOMBZEScsOSumwPssjCPlLbLsPIGffDLpZzMKzjarrjufhgxdrzywWosrblPRasvRUpZLaUbtDHGZQtvZOvHeVSTBHpitDllUljVvWrwvhpnVzeWVYhMPskMVcdeHzFZxTWocGvaKhhcnozRSbWsIEhpeNfJaRjLwWCvKfTLhuVsJczIYFPCyrOJxOPkXhVuCqCUgEluwLBCmqPwDvUPuBRrJZhfEXHXSBvljqJVVfEGRUWRSHPeKUJCpMpIsrVMuCmDTZPcAezRnyRTJkYyXkoLEmjtaCsKmNOKNHygTixMKNaSifidWNbeZYYHCGMtgJiTSlzRMjzOAMuhmYwincvBydQMDPaZclRsYUSeEnkclzGopkBozDQfXrQqHjRvlAQsijPCsrnUawvyskbTAnjctFftReVrIBFBKiLSFGmrLSrcnZKfOUwnCGYaMNKNhadSGMXwBaefDrMXoNeJsUaSGlWgttAqovosuhyBWwqQLkVKnRseXaaPwrMtdWjGiVXPvdsxbXzJwjxAITPpPWoGOnPWcSbHFZjBizKEBUECMLUKQRvVvWgIudKQkNjJmlUoUCaAHiTKVKcIpMeltJAYlVsrjBTLsWuyYwCJuJaewQSrzwXJNLAflzrZXBBEOCTtItNptaJkriIEhufpNysjJpeWbWcFqdEsiGfeIJbjRkOfNLjKIiIqbLfYRtldJPJEdsDJrZreCQGUhiIkjPwxrQfjPvsASxJnsqHKAKMJIPuOHYzxuITHEobVZUgmAlVBlqvPgHEGpelbIfzYKHmAmJFlwbhQHWeSLuvPQrUWEQcLwdkalMnyLVyZiFzomxyhHXLhFYswiIPrhmHVHQSJFzWSGUIaKytHzUTSlwSoPkBDPYJBUhXZuNrlPKzVtNoWnKrngtEkazGaWWNlfRRdYbWMbtMyqlOtyNVFyovtOfTqFaMVSmkApgbyffXFgSNqKxCtrjegbSaChypYNUqcfKxYEbgSiIzEqMlsHiHfJOdvhwFLIGAlecFxXxLLlgkAkJehUMZLrOROOArPPhNiVfPvFPrUPqmVZslfhprVpHoyvkAiuxhIrGesluecMjJGkvQkzYpLefAPTGcPlQngoaKzrvnlhtudzYMpKxMUEJfsxihneGfwPVeKqmaLGqIFRVsiZNppfwZZhfbaqznpIqZRMiyhBgBLCRqqDRgqQMUknFCGZqjqWSAubRCLQZnIbKDRhJrAQeboQctKmzSaFlMXjNqkujGmgtsWbcfEkRWluWBzwIKlvjCMDtnpGlHKXzouovFOySfqjnjWWlOtEbpbpVtGkWzqisJxASqiDLkjpozYyXnkovzHFCklyKQqiJHWtxMjpvDnVEzcXggQbdryUppwiiWzxDZEGzckGXATnTLuiTSvcQsrZPSmbcHPQEYeXCfFDlXsJdjRhzilGllXNdlSDSOHzCWwWKePFiQeUoDBhqMtmVPbWCXshWGFWQKtsoUdjOqPSjERRCtRdEpApFFwTDsZfNxVqsUTUgbjIXRJTIKHoWJZdUyQaZxrkaYHNAPvawmOgZuejuOCk";
		for (char c : decodeText.toCharArray()) {
			String letterCase = "ERROR";
			if (decodeBuilder.length() < 7) {
				for (char x : alphabetL.toCharArray()) {
					if (x == c) {
						decodeBuilder.append("l");
					}
				}
				for (char y : alphabetU.toCharArray()) {
					if(y == c) {
						decodeBuilder.append("u");
					}
				}
			} else if(decodeBuilder.length() == 7) {
				
			}
			runs++;
			decode = decodeBuilder.toString();
			if (runs > 6) {

			}
		}
	}
}
