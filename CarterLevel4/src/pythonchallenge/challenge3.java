package pythonchallenge;

public class challenge3 {
	public static void main(String args[]) {
		String alphabetL = "abcdefghijklmnopqrstuvwxyz";
		String alphabetU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder decode = new StringBuilder();
		StringBuilder decodeBuilder = new StringBuilder();
		decode.append(" ");
		int runs = 0;
		boolean goneThrough = false;
		String decodeText = "kAewtloYgcFQaJNhHVGxXDiQmzjfcpYbzxlWrVcqsmUbCunkfxZWDZjUZMiGqhRRiUvGmYmvnJIHEmbTMUKLECKdCthezSYBpIElRnZugFAxDRtQPpyeCBgBfaRVvvguRXLvkAdLOeCKxsDUvBBCwdpMMWmuELeGENihrpCLhujoBqPRDPvfzcwadMMMbkmkzCCzoTPfbRlzBqMblmxTxNniNoCufprWXxgHZpldkoLCrHJqvYuyJFCZtqXLhWiYzOXeglkzhVJIWmeUySGuFVmLTCyMshQtvZpPwuIbOHNoBauwvuJYCmqznOBgByPwTDQheAbsaMLjTmAOKmNsLziVMenFxQdATQIjItwtyCHyeMwQTNxbbLXWZnGmDqHhXnLHfEyvzxMhSXzdBEBaxeaPgQPttvqRvxHPEOUtIsttPDeeuGFgmDkKQcEYjuSuiGROGfYpzkQgvcCDBKrcYwHFlvPzDMEkMyuPxvGtgSvWgrybKOnbEGhqHUXHhnyjFwSfTfaiWtAOMBZEScsOSumwPssjCPlLbLsPIGffDLpZzMKzjarrjufhgxdrzywWosrblPRasvRUpZLaUbtDHGZQtvZOvHeVSTBHpitDllUljVvWrwvhpnVzeWVYhMPskMVcdeHzFZxTWocGvaKhhcnozRSbWsIEhpeNfJaRjLwWCvKfTLhuVsJczIYFPCyrOJxOPkXhVuCqCUgEluwLBCmqPwDvUPuBRrJZhfEXHXSBvljqJVVfEGRUWRSHPeKUJCpMpIsrVMuCmDTZPcAezRnyRTJkYyXkoLEmjtaCsKmNOKNHygTixMKNaSifidWNbeZYYHCGMtgJiTSlzRMjzOAMuhmYwincvBydQMDPaZclRsYUSeEnkclzGopkBozDQfXrQqHjRvlAQsijPCsrnUawvyskbTAnjctFftReVrIBFBKiLSFGmrLSrcnZKfOUwnCGYaMNKNhadSGMXwBaefDrMXoNeJsUaSGlWgttAqovosuhyBWwqQLkVKnRseXaaPwrMtdWjGiVXPvdsxbXzJwjxAITPpPWoGOnPWcSbHFZjBizKEBUECMLUKQRvVvWgIudKQkNjJmlUoUCaAHiTKVKcIpMeltJAYlVsrjBTLsWuyYwCJuJaewQSrzwXJNLAflzrZXBBEOCTtItNptaJkriIEhufpNysjJpeWbWcFqdEsiGfeIJbjRkOfNLjKIiIqbLfYRtldJPJEdsDJrZreCQGUhiIkjPwxrQfjPvsASxJnsqHKAKMJIPuOHYzxuITHEobVZUgmAlVBlqvPgHEGpelbIfzYKHmAmJFlwbhQHWeSLuvPQrUWEQcLwdkalMnyLVyZiFzomxyhHXLhFYswiIPrhmHVHQSJFzWSGUIaKytHzUTSlwSoPkBDPYJBUhXZuNrlPKzVtNoWnKrngtEkazGaWWNlfRRdYbWMbtMyqlOtyNVFyovtOfTqFaMVSmkApgbyffXFgSNqKxCtrjegbSaChypYNUqcfKxYEbgSiIzEqMlsHiHfJOdvhwFLIGAlecFxXxLLlgkAkJehUMZLrOROOArPPhNiVfPvFPrUPqmVZslfhprVpHoyvkAiuxhIrGesluecMjJGkvQkzYpLefAPTGcPlQngoaKzrvnlhtudzYMpKxMUEJfsxihneGfwPVeKqmaLGqIFRVsiZNppfwZZhfbaqznpIqZRMiyhBgBLCRqqDRgqQMUknFCGZqjqWSAubRCLQZnIbKDRhJrAQeboQctKmzSaFlMXjNqkujGmgtsWbcfEkRWluWBzwIKlvjCMDtnpGlHKXzouovFOySfqjnjWWlOtEbpbpVtGkWzqisJxASqiDLkjpozYyXnkovzHFCklyKQqiJHWtxMjpvDnVEzcXggQbdryUppwiiWzxDZEGzckGXATnTLuiTSvcQsrZPSmbcHPQEYeXCfFDlXsJdjRhzilGllXNdlSDSOHzCWwWKePFiQeUoDBhqMtmVPbWCXshWGFWQKtsoUdjOqPSjERRCtRdEpApFFwTDsZfNxVqsUTUgbjIXRJTIKHoWJZdUyQaZxrkaYHNAPvawmOgZuejuOCk";
		for (char c : decodeText.toCharArray()) {
			if(goneThrough) {
				decodeBuilder.deleteCharAt(0);
				decodeBuilder.insert(0, c);
				System.out.println(decode.toString());
				decode.deleteCharAt(0);
				decode.insert(0, c);
			}
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
				goneThrough = true;
				if(decodeBuilder.toString().equals("uuuluuu")) {
					System.out.println(decode);
				} else {
					for (char x : alphabetL.toCharArray()) {
						if (x == c) {
							decodeBuilder.insert(1, "l");
						}
					}
					for (char y : alphabetU.toCharArray()) {
						if(y == c) {
							decodeBuilder.insert(1, "u");
						}
					}
				}
			}
			runs++;
		}
	}
}
