package br.edu.pattertproject.fireman.Fireman.state_pattern.strategy_pattern;

public enum TipoTaxa {
	ANUAL {
		@Override
		public StrategyTaxa obterTipoTaxa() {
			return new TaxaAnual();
		}
	},

	HABITESE {
		@Override
		public StrategyTaxa obterTipoTaxa() {
			return new TaxaImposto();
		}
	};

	public abstract StrategyTaxa obterTipoTaxa();

}