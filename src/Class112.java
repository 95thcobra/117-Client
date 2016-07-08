public class Class112 {
	Class126 aClass126_827 = new Class126();
	Class126 aClass126_828;

	public Class112() {
		aClass126_827.aClass126_887 = aClass126_827;
		aClass126_827.aClass126_886 = aClass126_827;
	}

	public void method452(final Class126 var1) {
		if (var1.aClass126_886 != null)
			var1.method490();

		var1.aClass126_886 = aClass126_827.aClass126_886;
		var1.aClass126_887 = aClass126_827;
		var1.aClass126_886.aClass126_887 = var1;
		var1.aClass126_887.aClass126_886 = var1;
	}

	public Class126 method453() {
		final Class126 var1 = aClass126_827.aClass126_887;
		if (var1 == aClass126_827) {
			aClass126_828 = null;
			return null;
		} else {
			aClass126_828 = var1.aClass126_887;
			return var1;
		}
	}

	public Class126 method454() {
		final Class126 var1 = aClass126_828;
		if (var1 == aClass126_827) {
			aClass126_828 = null;
			return null;
		} else {
			aClass126_828 = var1.aClass126_887;
			return var1;
		}
	}
}
