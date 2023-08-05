package org.huangcj.quant.ak.autogen;

import org.huangcj.quant.ak.autogen.model.*;
import jakarta.annotation.PostConstruct;
import org.huangcj.quant.ak.annotation.AkParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.lang.reflect.Field;

@Component
public class AkApi {
    
    public StockZhKcbDailyRes[] stockZhKcbDaily(StockZhKcbDailyReq req) {
        return akGet("stock_zh_kcb_daily", req, StockZhKcbDailyRes[].class);
    }

    public StockBuffettIndexLgRes[] stockBuffettIndexLg(StockBuffettIndexLgReq req) {
        return akGet("stock_buffett_index_lg", req, StockBuffettIndexLgRes[].class);
    }

    public StockInfoShDelistRes[] stockInfoShDelist(StockInfoShDelistReq req) {
        return akGet("stock_info_sh_delist", req, StockInfoShDelistRes[].class);
    }

    public StockBoardConceptHistThsRes[] stockBoardConceptHistThs(StockBoardConceptHistThsReq req) {
        return akGet("stock_board_concept_hist_ths", req, StockBoardConceptHistThsRes[].class);
    }

    public StockUsHistMinEmRes[] stockUsHistMinEm(StockUsHistMinEmReq req) {
        return akGet("stock_us_hist_min_em", req, StockUsHistMinEmRes[].class);
    }

    public StockCgEquityMortgageCninfoRes[] stockCgEquityMortgageCninfo(StockCgEquityMortgageCninfoReq req) {
        return akGet("stock_cg_equity_mortgage_cninfo", req, StockCgEquityMortgageCninfoRes[].class);
    }

    public StockLhbDetailEmRes[] stockLhbDetailEm(StockLhbDetailEmReq req) {
        return akGet("stock_lhb_detail_em", req, StockLhbDetailEmRes[].class);
    }

    public StockRestrictedReleaseSummaryEmRes[] stockRestrictedReleaseSummaryEm(StockRestrictedReleaseSummaryEmReq req) {
        return akGet("stock_restricted_release_summary_em", req, StockRestrictedReleaseSummaryEmRes[].class);
    }

    public StockHsgtBoardRankEmRes[] stockHsgtBoardRankEm(StockHsgtBoardRankEmReq req) {
        return akGet("stock_hsgt_board_rank_em", req, StockHsgtBoardRankEmRes[].class);
    }

    public StockHsgtIndividualDetailEmRes[] stockHsgtIndividualDetailEm(StockHsgtIndividualDetailEmReq req) {
        return akGet("stock_hsgt_individual_detail_em", req, StockHsgtIndividualDetailEmRes[].class);
    }

    public StockRankLjqdThsRes[] stockRankLjqdThs(StockRankLjqdThsReq req) {
        return akGet("stock_rank_ljqd_ths", req, StockRankLjqdThsRes[].class);
    }

    public StockAAllPbRes[] stockAAllPb(StockAAllPbReq req) {
        return akGet("stock_a_all_pb", req, StockAAllPbRes[].class);
    }

    public StockGpzyIndustryDataEmRes[] stockGpzyIndustryDataEm(StockGpzyIndustryDataEmReq req) {
        return akGet("stock_gpzy_industry_data_em", req, StockGpzyIndustryDataEmRes[].class);
    }

    public StockFinancialHkAnalysisIndicatorEmRes[] stockFinancialHkAnalysisIndicatorEm(StockFinancialHkAnalysisIndicatorEmReq req) {
        return akGet("stock_financial_hk_analysis_indicator_em", req, StockFinancialHkAnalysisIndicatorEmRes[].class);
    }

    public StockZhBMinuteRes[] stockZhBMinute(StockZhBMinuteReq req) {
        return akGet("stock_zh_b_minute", req, StockZhBMinuteRes[].class);
    }

    public StockSyEmRes[] stockSyEm(StockSyEmReq req) {
        return akGet("stock_sy_em", req, StockSyEmRes[].class);
    }

    public StockHkHotRankEmRes[] stockHkHotRankEm(StockHkHotRankEmReq req) {
        return akGet("stock_hk_hot_rank_em", req, StockHkHotRankEmRes[].class);
    }

    public StockSgtReferenceExchangeRateSzseRes[] stockSgtReferenceExchangeRateSzse(StockSgtReferenceExchangeRateSzseReq req) {
        return akGet("stock_sgt_reference_exchange_rate_szse", req, StockSgtReferenceExchangeRateSzseRes[].class);
    }

    public StockLhbJgmmtjEmRes[] stockLhbJgmmtjEm(StockLhbJgmmtjEmReq req) {
        return akGet("stock_lhb_jgmmtj_em", req, StockLhbJgmmtjEmRes[].class);
    }

    public StockIpoInfoRes[] stockIpoInfo(StockIpoInfoReq req) {
        return akGet("stock_ipo_info", req, StockIpoInfoRes[].class);
    }

    public StockSectorFundFlowRankRes[] stockSectorFundFlowRank(StockSectorFundFlowRankReq req) {
        return akGet("stock_sector_fund_flow_rank", req, StockSectorFundFlowRankRes[].class);
    }

    public StockSzseAreaSummaryRes[] stockSzseAreaSummary(StockSzseAreaSummaryReq req) {
        return akGet("stock_szse_area_summary", req, StockSzseAreaSummaryRes[].class);
    }

    public StockHsgtSouthAccFlowInEmRes[] stockHsgtSouthAccFlowInEm(StockHsgtSouthAccFlowInEmReq req) {
        return akGet("stock_hsgt_south_acc_flow_in_em", req, StockHsgtSouthAccFlowInEmRes[].class);
    }

    public StockZhATickTxRes[] stockZhATickTx(StockZhATickTxReq req) {
        return akGet("stock_zh_a_tick_tx", req, StockZhATickTxRes[].class);
    }

    public StockHoldControlCninfoRes[] stockHoldControlCninfo(StockHoldControlCninfoReq req) {
        return akGet("stock_hold_control_cninfo", req, StockHoldControlCninfoRes[].class);
    }

    public StockNewGhCninfoRes[] stockNewGhCninfo(StockNewGhCninfoReq req) {
        return akGet("stock_new_gh_cninfo", req, StockNewGhCninfoRes[].class);
    }

    public StockHistoryDividendRes[] stockHistoryDividend(StockHistoryDividendReq req) {
        return akGet("stock_history_dividend", req, StockHistoryDividendRes[].class);
    }

    public StockRegisterDbRes[] stockRegisterDb(StockRegisterDbReq req) {
        return akGet("stock_register_db", req, StockRegisterDbRes[].class);
    }

    public StockBoardConceptNameThsRes[] stockBoardConceptNameThs(StockBoardConceptNameThsReq req) {
        return akGet("stock_board_concept_name_ths", req, StockBoardConceptNameThsRes[].class);
    }

    public StockUsZhDailyRes[] stockUsZhDaily(StockUsZhDailyReq req) {
        return akGet("stock_us_zh_daily", req, StockUsZhDailyRes[].class);
    }

    public StockYjkbEmRes[] stockYjkbEm(StockYjkbEmReq req) {
        return akGet("stock_yjkb_em", req, StockYjkbEmRes[].class);
    }

    public StockZhIndexSpotRes[] stockZhIndexSpot(StockZhIndexSpotReq req) {
        return akGet("stock_zh_index_spot", req, StockZhIndexSpotRes[].class);
    }

    public StockReportDisclosureRes[] stockReportDisclosure(StockReportDisclosureReq req) {
        return akGet("stock_report_disclosure", req, StockReportDisclosureRes[].class);
    }

    public StockCommentEmRes[] stockCommentEm(StockCommentEmReq req) {
        return akGet("stock_comment_em", req, StockCommentEmRes[].class);
    }

    public StockFinancialAnalysisIndicatorRes[] stockFinancialAnalysisIndicator(StockFinancialAnalysisIndicatorReq req) {
        return akGet("stock_financial_analysis_indicator", req, StockFinancialAnalysisIndicatorRes[].class);
    }

    public StockMarginDetailSzseRes[] stockMarginDetailSzse(StockMarginDetailSzseReq req) {
        return akGet("stock_margin_detail_szse", req, StockMarginDetailSzseRes[].class);
    }

    public StockDzjyMrtjRes[] stockDzjyMrtj(StockDzjyMrtjReq req) {
        return akGet("stock_dzjy_mrtj", req, StockDzjyMrtjRes[].class);
    }

    public StockFundFlowBigDealRes[] stockFundFlowBigDeal(StockFundFlowBigDealReq req) {
        return akGet("stock_fund_flow_big_deal", req, StockFundFlowBigDealRes[].class);
    }

    public StockBjASpotEmRes[] stockBjASpotEm(StockBjASpotEmReq req) {
        return akGet("stock_bj_a_spot_em", req, StockBjASpotEmRes[].class);
    }

    public StockGpzyPledgeRatioDetailEmRes[] stockGpzyPledgeRatioDetailEm(StockGpzyPledgeRatioDetailEmReq req) {
        return akGet("stock_gpzy_pledge_ratio_detail_em", req, StockGpzyPledgeRatioDetailEmRes[].class);
    }

    public StockSseSummaryRes[] stockSseSummary(StockSseSummaryReq req) {
        return akGet("stock_sse_summary", req, StockSseSummaryRes[].class);
    }

    public StockRestrictedReleaseDetailEmRes[] stockRestrictedReleaseDetailEm(StockRestrictedReleaseDetailEmReq req) {
        return akGet("stock_restricted_release_detail_em", req, StockRestrictedReleaseDetailEmRes[].class);
    }

    public StockRankLjqsThsRes[] stockRankLjqsThs(StockRankLjqsThsReq req) {
        return akGet("stock_rank_ljqs_ths", req, StockRankLjqsThsRes[].class);
    }

    public StockEsgHzSinaRes[] stockEsgHzSina(StockEsgHzSinaReq req) {
        return akGet("stock_esg_hz_sina", req, StockEsgHzSinaRes[].class);
    }

    public StockFundFlowIndividualRes[] stockFundFlowIndividual(StockFundFlowIndividualReq req) {
        return akGet("stock_fund_flow_individual", req, StockFundFlowIndividualRes[].class);
    }

    public StockFundStockHolderRes[] stockFundStockHolder(StockFundStockHolderReq req) {
        return akGet("stock_fund_stock_holder", req, StockFundStockHolderRes[].class);
    }

    public StockRestrictedReleaseQueueSinaRes[] stockRestrictedReleaseQueueSina(StockRestrictedReleaseQueueSinaReq req) {
        return akGet("stock_restricted_release_queue_sina", req, StockRestrictedReleaseQueueSinaRes[].class);
    }

    public StockSyJzEmRes[] stockSyJzEm(StockSyJzEmReq req) {
        return akGet("stock_sy_jz_em", req, StockSyJzEmRes[].class);
    }

    public StockInfoACodeNameRes[] stockInfoACodeName(StockInfoACodeNameReq req) {
        return akGet("stock_info_a_code_name", req, StockInfoACodeNameRes[].class);
    }

    public StockTelegraphClsRes[] stockTelegraphCls(StockTelegraphClsReq req) {
        return akGet("stock_telegraph_cls", req, StockTelegraphClsRes[].class);
    }

    public StockZhKcbSpotRes[] stockZhKcbSpot(StockZhKcbSpotReq req) {
        return akGet("stock_zh_kcb_spot", req, StockZhKcbSpotRes[].class);
    }

    public StockZhACdrDailyRes[] stockZhACdrDaily(StockZhACdrDailyReq req) {
        return akGet("stock_zh_a_cdr_daily", req, StockZhACdrDailyRes[].class);
    }

    public StockGdfxFreeTop10EmRes[] stockGdfxFreeTop10Em(StockGdfxFreeTop10EmReq req) {
        return akGet("stock_gdfx_free_top_10_em", req, StockGdfxFreeTop10EmRes[].class);
    }

    public StockIpoBenefitThsRes[] stockIpoBenefitThs(StockIpoBenefitThsReq req) {
        return akGet("stock_ipo_benefit_ths", req, StockIpoBenefitThsRes[].class);
    }

    public StockCommentDetailScrdDesireDailyEmRes[] stockCommentDetailScrdDesireDailyEm(StockCommentDetailScrdDesireDailyEmReq req) {
        return akGet("stock_comment_detail_scrd_desire_daily_em", req, StockCommentDetailScrdDesireDailyEmRes[].class);
    }

    public StockSzseSummaryRes[] stockSzseSummary(StockSzseSummaryReq req) {
        return akGet("stock_szse_summary", req, StockSzseSummaryRes[].class);
    }

    public StockHotRankDetailEmRes[] stockHotRankDetailEm(StockHotRankDetailEmReq req) {
        return akGet("stock_hot_rank_detail_em", req, StockHotRankDetailEmRes[].class);
    }

    public StockProfitForecastThsRes[] stockProfitForecastThs(StockProfitForecastThsReq req) {
        return akGet("stock_profit_forecast_ths", req, StockProfitForecastThsRes[].class);
    }

    public StockRankCxflThsRes[] stockRankCxflThs(StockRankCxflThsReq req) {
        return akGet("stock_rank_cxfl_ths", req, StockRankCxflThsRes[].class);
    }

    public StockACongestionLgRes[] stockACongestionLg(StockACongestionLgReq req) {
        return akGet("stock_a_congestion_lg", req, StockACongestionLgRes[].class);
    }

    public StockCyASpotEmRes[] stockCyASpotEm(StockCyASpotEmReq req) {
        return akGet("stock_cy_a_spot_em", req, StockCyASpotEmRes[].class);
    }

    public StockMarketFundFlowRes[] stockMarketFundFlow(StockMarketFundFlowReq req) {
        return akGet("stock_market_fund_flow", req, StockMarketFundFlowRes[].class);
    }

    public StockHsgtHoldStockEmRes[] stockHsgtHoldStockEm(StockHsgtHoldStockEmReq req) {
        return akGet("stock_hsgt_hold_stock_em", req, StockHsgtHoldStockEmRes[].class);
    }

    public StockLhbJgzzSinaRes[] stockLhbJgzzSina(StockLhbJgzzSinaReq req) {
        return akGet("stock_lhb_jgzz_sina", req, StockLhbJgzzSinaRes[].class);
    }

    public StockZhAHistMinEmRes[] stockZhAHistMinEm(StockZhAHistMinEmReq req) {
        return akGet("stock_zh_a_hist_min_em", req, StockZhAHistMinEmRes[].class);
    }

    public StockZhANewRes[] stockZhANew(StockZhANewReq req) {
        return akGet("stock_zh_a_new", req, StockZhANewRes[].class);
    }

    public StockYjygEmRes[] stockYjygEm(StockYjygEmReq req) {
        return akGet("stock_yjyg_em", req, StockYjygEmRes[].class);
    }

    public StockZtPoolStrongEmRes[] stockZtPoolStrongEm(StockZtPoolStrongEmReq req) {
        return akGet("stock_zt_pool_strong_em", req, StockZtPoolStrongEmRes[].class);
    }

    public StockZtPoolEmRes[] stockZtPoolEm(StockZtPoolEmReq req) {
        return akGet("stock_zt_pool_em", req, StockZtPoolEmRes[].class);
    }

    public StockFundFlowConceptRes[] stockFundFlowConcept(StockFundFlowConceptReq req) {
        return akGet("stock_fund_flow_concept", req, StockFundFlowConceptRes[].class);
    }

    public StockHsgtInstitutionStatisticsEmRes[] stockHsgtInstitutionStatisticsEm(StockHsgtInstitutionStatisticsEmReq req) {
        return akGet("stock_hsgt_institution_statistics_em", req, StockHsgtInstitutionStatisticsEmRes[].class);
    }

    public StockZhVoteBaiduRes[] stockZhVoteBaidu(StockZhVoteBaiduReq req) {
        return akGet("stock_zh_vote_baidu", req, StockZhVoteBaiduRes[].class);
    }

    public StockSzASpotEmRes[] stockSzASpotEm(StockSzASpotEmReq req) {
        return akGet("stock_sz_a_spot_em", req, StockSzASpotEmRes[].class);
    }

    public StockQsjyEmRes[] stockQsjyEm(StockQsjyEmReq req) {
        return akGet("stock_qsjy_em", req, StockQsjyEmRes[].class);
    }

    public StockUsSpotEmRes[] stockUsSpotEm(StockUsSpotEmReq req) {
        return akGet("stock_us_spot_em", req, StockUsSpotEmRes[].class);
    }

    public StockHsgtSouthCashEmRes[] stockHsgtSouthCashEm(StockHsgtSouthCashEmReq req) {
        return akGet("stock_hsgt_south_cash_em", req, StockHsgtSouthCashEmRes[].class);
    }

    public StockChangesEmRes[] stockChangesEm(StockChangesEmReq req) {
        return akGet("stock_changes_em", req, StockChangesEmRes[].class);
    }

    public StockCommentDetailZlkpJgcydEmRes[] stockCommentDetailZlkpJgcydEm(StockCommentDetailZlkpJgcydEmReq req) {
        return akGet("stock_comment_detail_zlkp_jgcyd_em", req, StockCommentDetailZlkpJgcydEmRes[].class);
    }

    public StockZhAhDailyRes[] stockZhAhDaily(StockZhAhDailyReq req) {
        return akGet("stock_zh_ah_daily", req, StockZhAhDailyRes[].class);
    }

    public StockHotRankLatestEmRes[] stockHotRankLatestEm(StockHotRankLatestEmReq req) {
        return akGet("stock_hot_rank_latest_em", req, StockHotRankLatestEmRes[].class);
    }

    public StockLhbTraderstatisticEmRes[] stockLhbTraderstatisticEm(StockLhbTraderstatisticEmReq req) {
        return akGet("stock_lhb_traderstatistic_em", req, StockLhbTraderstatisticEmRes[].class);
    }

    public StockZhBSpotRes[] stockZhBSpot(StockZhBSpotReq req) {
        return akGet("stock_zh_b_spot", req, StockZhBSpotRes[].class);
    }

    public StockHsgtSouthNetFlowInEmRes[] stockHsgtSouthNetFlowInEm(StockHsgtSouthNetFlowInEmReq req) {
        return akGet("stock_hsgt_south_net_flow_in_em", req, StockHsgtSouthNetFlowInEmRes[].class);
    }

    public StockMarginSzseRes[] stockMarginSzse(StockMarginSzseReq req) {
        return akGet("stock_margin_szse", req, StockMarginSzseRes[].class);
    }

    public StockMarginUnderlyingInfoSzseRes[] stockMarginUnderlyingInfoSzse(StockMarginUnderlyingInfoSzseReq req) {
        return akGet("stock_margin_underlying_info_szse", req, StockMarginUnderlyingInfoSzseRes[].class);
    }

    public StockFhpsDetailThsRes[] stockFhpsDetailThs(StockFhpsDetailThsReq req) {
        return akGet("stock_fhps_detail_ths", req, StockFhpsDetailThsRes[].class);
    }

    public StockZhIndexDailyRes[] stockZhIndexDaily(StockZhIndexDailyReq req) {
        return akGet("stock_zh_index_daily", req, StockZhIndexDailyRes[].class);
    }

    public StockHotUpEmRes[] stockHotUpEm(StockHotUpEmReq req) {
        return akGet("stock_hot_up_em", req, StockHotUpEmRes[].class);
    }

    public StockRankCxdThsRes[] stockRankCxdThs(StockRankCxdThsReq req) {
        return akGet("stock_rank_cxd_ths", req, StockRankCxdThsRes[].class);
    }

    public StockHotTgbRes[] stockHotTgb(StockHotTgbReq req) {
        return akGet("stock_hot_tgb", req, StockHotTgbRes[].class);
    }

    public StockZhAGdhsDetailEmRes[] stockZhAGdhsDetailEm(StockZhAGdhsDetailEmReq req) {
        return akGet("stock_zh_a_gdhs_detail_em", req, StockZhAGdhsDetailEmRes[].class);
    }

    public StockFinancialHkReportEmRes[] stockFinancialHkReportEm(StockFinancialHkReportEmReq req) {
        return akGet("stock_financial_hk_report_em", req, StockFinancialHkReportEmRes[].class);
    }

    public StockGdfxHoldingAnalyseEmRes[] stockGdfxHoldingAnalyseEm(StockGdfxHoldingAnalyseEmReq req) {
        return akGet("stock_gdfx_holding_analyse_em", req, StockGdfxHoldingAnalyseEmRes[].class);
    }

    public StockHkHotRankLatestEmRes[] stockHkHotRankLatestEm(StockHkHotRankLatestEmReq req) {
        return akGet("stock_hk_hot_rank_latest_em", req, StockHkHotRankLatestEmRes[].class);
    }

    public StockConceptFundFlowHistRes[] stockConceptFundFlowHist(StockConceptFundFlowHistReq req) {
        return akGet("stock_concept_fund_flow_hist", req, StockConceptFundFlowHistRes[].class);
    }

    public StockZhValuationBaiduRes[] stockZhValuationBaidu(StockZhValuationBaiduReq req) {
        return akGet("stock_zh_valuation_baidu", req, StockZhValuationBaiduRes[].class);
    }

    public StockLhbYybphEmRes[] stockLhbYybphEm(StockLhbYybphEmReq req) {
        return akGet("stock_lhb_yybph_em", req, StockLhbYybphEmRes[].class);
    }

    public StockHotKeywordEmRes[] stockHotKeywordEm(StockHotKeywordEmReq req) {
        return akGet("stock_hot_keyword_em", req, StockHotKeywordEmRes[].class);
    }

    public StockKcASpotEmRes[] stockKcASpotEm(StockKcASpotEmReq req) {
        return akGet("stock_kc_a_spot_em", req, StockKcASpotEmRes[].class);
    }

    public StockZtPoolSubNewEmRes[] stockZtPoolSubNewEm(StockZtPoolSubNewEmReq req) {
        return akGet("stock_zt_pool_sub_new_em", req, StockZtPoolSubNewEmRes[].class);
    }

    public StockGdfxHoldingChangeEmRes[] stockGdfxHoldingChangeEm(StockGdfxHoldingChangeEmReq req) {
        return akGet("stock_gdfx_holding_change_em", req, StockGdfxHoldingChangeEmRes[].class);
    }

    public StockEsgRateSinaRes[] stockEsgRateSina(StockEsgRateSinaReq req) {
        return akGet("stock_esg_rate_sina", req, StockEsgRateSinaRes[].class);
    }

    public StockCgLawsuitCninfoRes[] stockCgLawsuitCninfo(StockCgLawsuitCninfoReq req) {
        return akGet("stock_cg_lawsuit_cninfo", req, StockCgLawsuitCninfoRes[].class);
    }

    public StockGdfxHoldingTeamworkEmRes[] stockGdfxHoldingTeamworkEm(StockGdfxHoldingTeamworkEmReq req) {
        return akGet("stock_gdfx_holding_teamwork_em", req, StockGdfxHoldingTeamworkEmRes[].class);
    }

    public StockJgdyTjEmRes[] stockJgdyTjEm(StockJgdyTjEmReq req) {
        return akGet("stock_jgdy_tj_em", req, StockJgdyTjEmRes[].class);
    }

    public StockSyProfileEmRes[] stockSyProfileEm(StockSyProfileEmReq req) {
        return akGet("stock_sy_profile_em", req, StockSyProfileEmRes[].class);
    }

    public StockRegisterCybRes[] stockRegisterCyb(StockRegisterCybReq req) {
        return akGet("stock_register_cyb", req, StockRegisterCybRes[].class);
    }

    public StockRankXstpThsRes[] stockRankXstpThs(StockRankXstpThsReq req) {
        return akGet("stock_rank_xstp_ths", req, StockRankXstpThsRes[].class);
    }

    public StockHsgtFundFlowSummaryEmRes[] stockHsgtFundFlowSummaryEm(StockHsgtFundFlowSummaryEmReq req) {
        return akGet("stock_hsgt_fund_flow_summary_em", req, StockHsgtFundFlowSummaryEmRes[].class);
    }

    public StockLhbHyyybEmRes[] stockLhbHyyybEm(StockLhbHyyybEmReq req) {
        return akGet("stock_lhb_hyyyb_em", req, StockLhbHyyybEmRes[].class);
    }

    public StockZygcEmRes[] stockZygcEm(StockZygcEmReq req) {
        return akGet("stock_zygc_em", req, StockZygcEmRes[].class);
    }

    public StockHsgtNorthAccFlowInEmRes[] stockHsgtNorthAccFlowInEm(StockHsgtNorthAccFlowInEmReq req) {
        return akGet("stock_hsgt_north_acc_flow_in_em", req, StockHsgtNorthAccFlowInEmRes[].class);
    }

    public StockDzjySctjRes[] stockDzjySctj(StockDzjySctjReq req) {
        return akGet("stock_dzjy_sctj", req, StockDzjySctjRes[].class);
    }

    public StockZhASpotEmRes[] stockZhASpotEm(StockZhASpotEmReq req) {
        return akGet("stock_zh_a_spot_em", req, StockZhASpotEmRes[].class);
    }

    public StockLhbDetailDailySinaRes[] stockLhbDetailDailySina(StockLhbDetailDailySinaReq req) {
        return akGet("stock_lhb_detail_daily_sina", req, StockLhbDetailDailySinaRes[].class);
    }

    public StockGdfxFreeHoldingDetailEmRes[] stockGdfxFreeHoldingDetailEm(StockGdfxFreeHoldingDetailEmReq req) {
        return akGet("stock_gdfx_free_holding_detail_em", req, StockGdfxFreeHoldingDetailEmRes[].class);
    }

    public StockGdfxFreeHoldingStatisticsEmRes[] stockGdfxFreeHoldingStatisticsEm(StockGdfxFreeHoldingStatisticsEmReq req) {
        return akGet("stock_gdfx_free_holding_statistics_em", req, StockGdfxFreeHoldingStatisticsEmRes[].class);
    }

    public StockRepurchaseEmRes[] stockRepurchaseEm(StockRepurchaseEmReq req) {
        return akGet("stock_repurchase_em", req, StockRepurchaseEmRes[].class);
    }

    public StockGdfxFreeHoldingAnalyseEmRes[] stockGdfxFreeHoldingAnalyseEm(StockGdfxFreeHoldingAnalyseEmReq req) {
        return akGet("stock_gdfx_free_holding_analyse_em", req, StockGdfxFreeHoldingAnalyseEmRes[].class);
    }

    public StockZcfzEmRes[] stockZcfzEm(StockZcfzEmReq req) {
        return akGet("stock_zcfz_em", req, StockZcfzEmRes[].class);
    }

    public StockDxsylEmRes[] stockDxsylEm(StockDxsylEmReq req) {
        return akGet("stock_dxsyl_em", req, StockDxsylEmRes[].class);
    }

    public StockRestrictedReleaseStockholderEmRes[] stockRestrictedReleaseStockholderEm(StockRestrictedReleaseStockholderEmReq req) {
        return akGet("stock_restricted_release_stockholder_em", req, StockRestrictedReleaseStockholderEmRes[].class);
    }

    public StockQbzfEmRes[] stockQbzfEm(StockQbzfEmReq req) {
        return akGet("stock_qbzf_em", req, StockQbzfEmRes[].class);
    }

    public StockZhAHistPreMinEmRes[] stockZhAHistPreMinEm(StockZhAHistPreMinEmReq req) {
        return akGet("stock_zh_a_hist_pre_min_em", req, StockZhAHistPreMinEmRes[].class);
    }

    public StockCommentDetailScrdFocusEmRes[] stockCommentDetailScrdFocusEm(StockCommentDetailScrdFocusEmReq req) {
        return akGet("stock_comment_detail_scrd_focus_em", req, StockCommentDetailScrdFocusEmRes[].class);
    }

    public StockInfoBjNameCodeRes[] stockInfoBjNameCode(StockInfoBjNameCodeReq req) {
        return akGet("stock_info_bj_name_code", req, StockInfoBjNameCodeRes[].class);
    }

    public StockNewASpotEmRes[] stockNewASpotEm(StockNewASpotEmReq req) {
        return akGet("stock_new_a_spot_em", req, StockNewASpotEmRes[].class);
    }

    public StockGpzyProfileEmRes[] stockGpzyProfileEm(StockGpzyProfileEmReq req) {
        return akGet("stock_gpzy_profile_em", req, StockGpzyProfileEmRes[].class);
    }

    public StockIndexPbLgRes[] stockIndexPbLg(StockIndexPbLgReq req) {
        return akGet("stock_index_pb_lg", req, StockIndexPbLgRes[].class);
    }

    public StockBoardChangeEmRes[] stockBoardChangeEm(StockBoardChangeEmReq req) {
        return akGet("stock_board_change_em", req, StockBoardChangeEmRes[].class);
    }

    public StockInstituteHoldRes[] stockInstituteHold(StockInstituteHoldReq req) {
        return akGet("stock_institute_hold", req, StockInstituteHoldRes[].class);
    }

    public StockXgsglbEmRes[] stockXgsglbEm(StockXgsglbEmReq req) {
        return akGet("stock_xgsglb_em", req, StockXgsglbEmRes[].class);
    }

    public StockHkFhpxDetailThsRes[] stockHkFhpxDetailThs(StockHkFhpxDetailThsReq req) {
        return akGet("stock_hk_fhpx_detail_ths", req, StockHkFhpxDetailThsRes[].class);
    }

    public StockIndividualInfoEmRes[] stockIndividualInfoEm(StockIndividualInfoEmReq req) {
        return akGet("stock_individual_info_em", req, StockIndividualInfoEmRes[].class);
    }

    public StockRankXzjpThsRes[] stockRankXzjpThs(StockRankXzjpThsReq req) {
        return akGet("stock_rank_xzjp_ths", req, StockRankXzjpThsRes[].class);
    }

    public StockXjllEmRes[] stockXjllEm(StockXjllEmReq req) {
        return akGet("stock_xjll_em", req, StockXjllEmRes[].class);
    }

    public StockMarketPeLgRes[] stockMarketPeLg(StockMarketPeLgReq req) {
        return akGet("stock_market_pe_lg", req, StockMarketPeLgRes[].class);
    }

    public StockGpzyDistributeStatisticsCompanyEmRes[] stockGpzyDistributeStatisticsCompanyEm(StockGpzyDistributeStatisticsCompanyEmReq req) {
        return akGet("stock_gpzy_distribute_statistics_company_em", req, StockGpzyDistributeStatisticsCompanyEmRes[].class);
    }

    public StockHsgtNorthCashEmRes[] stockHsgtNorthCashEm(StockHsgtNorthCashEmReq req) {
        return akGet("stock_hsgt_north_cash_em", req, StockHsgtNorthCashEmRes[].class);
    }

    public StockLhbYytjSinaRes[] stockLhbYytjSina(StockLhbYytjSinaReq req) {
        return akGet("stock_lhb_yytj_sina", req, StockLhbYytjSinaRes[].class);
    }

    public StockBoardConceptConsEmRes[] stockBoardConceptConsEm(StockBoardConceptConsEmReq req) {
        return akGet("stock_board_concept_cons_em", req, StockBoardConceptConsEmRes[].class);
    }

    public StockRankForecastCninfoRes[] stockRankForecastCninfo(StockRankForecastCninfoReq req) {
        return akGet("stock_rank_forecast_cninfo", req, StockRankForecastCninfoRes[].class);
    }

    public StockDzjyHyyybtjRes[] stockDzjyHyyybtj(StockDzjyHyyybtjReq req) {
        return akGet("stock_dzjy_hyyybtj", req, StockDzjyHyyybtjRes[].class);
    }

    public StockHkDailyRes[] stockHkDaily(StockHkDailyReq req) {
        return akGet("stock_hk_daily", req, StockHkDailyRes[].class);
    }

    public StockAHighLowStatisticsRes[] stockAHighLowStatistics(StockAHighLowStatisticsReq req) {
        return akGet("stock_a_high_low_statistics", req, StockAHighLowStatisticsRes[].class);
    }

    public StockIndividualFundFlowRes[] stockIndividualFundFlow(StockIndividualFundFlowReq req) {
        return akGet("stock_individual_fund_flow", req, StockIndividualFundFlowRes[].class);
    }

    public StockInfoSzDelistRes[] stockInfoSzDelist(StockInfoSzDelistReq req) {
        return akGet("stock_info_sz_delist", req, StockInfoSzDelistRes[].class);
    }

    public StockLhbJgstatisticEmRes[] stockLhbJgstatisticEm(StockLhbJgstatisticEmReq req) {
        return akGet("stock_lhb_jgstatistic_em", req, StockLhbJgstatisticEmRes[].class);
    }

    public StockCommentDetailZhpjLspfEmRes[] stockCommentDetailZhpjLspfEm(StockCommentDetailZhpjLspfEmReq req) {
        return akGet("stock_comment_detail_zhpj_lspf_em", req, StockCommentDetailZhpjLspfEmRes[].class);
    }

    public StockUsZhSpotRes[] stockUsZhSpot(StockUsZhSpotReq req) {
        return akGet("stock_us_zh_spot", req, StockUsZhSpotRes[].class);
    }

    public StockProfileCninfoRes[] stockProfileCninfo(StockProfileCninfoReq req) {
        return akGet("stock_profile_cninfo", req, StockProfileCninfoRes[].class);
    }

    public StockLhYybCapitalRes[] stockLhYybCapital(StockLhYybCapitalReq req) {
        return akGet("stock_lh_yyb_capital", req, StockLhYybCapitalRes[].class);
    }

    public StockIndustryCategoryCninfoRes[] stockIndustryCategoryCninfo(StockIndustryCategoryCninfoReq req) {
        return akGet("stock_industry_category_cninfo", req, StockIndustryCategoryCninfoRes[].class);
    }

    public StockUsPinkSpotEmRes[] stockUsPinkSpotEm(StockUsPinkSpotEmReq req) {
        return akGet("stock_us_pink_spot_em", req, StockUsPinkSpotEmRes[].class);
    }

    public StockSectorFundFlowHistRes[] stockSectorFundFlowHist(StockSectorFundFlowHistReq req) {
        return akGet("stock_sector_fund_flow_hist", req, StockSectorFundFlowHistRes[].class);
    }

    public StockUsHistRes[] stockUsHist(StockUsHistReq req) {
        return akGet("stock_us_hist", req, StockUsHistRes[].class);
    }

    public StockInfoSzChangeNameRes[] stockInfoSzChangeName(StockInfoSzChangeNameReq req) {
        return akGet("stock_info_sz_change_name", req, StockInfoSzChangeNameRes[].class);
    }

    public StockAllotmentCninfoRes[] stockAllotmentCninfo(StockAllotmentCninfoReq req) {
        return akGet("stock_allotment_cninfo", req, StockAllotmentCninfoRes[].class);
    }

    public StockZhAMinuteRes[] stockZhAMinute(StockZhAMinuteReq req) {
        return akGet("stock_zh_a_minute", req, StockZhAMinuteRes[].class);
    }

    public StockSgtSettlementExchangeRateSseRes[] stockSgtSettlementExchangeRateSse(StockSgtSettlementExchangeRateSseReq req) {
        return akGet("stock_sgt_settlement_exchange_rate_sse", req, StockSgtSettlementExchangeRateSseRes[].class);
    }

    public StockInfoSzNameCodeRes[] stockInfoSzNameCode(StockInfoSzNameCodeReq req) {
        return akGet("stock_info_sz_name_code", req, StockInfoSzNameCodeRes[].class);
    }

    public StockSyHyEmRes[] stockSyHyEm(StockSyHyEmReq req) {
        return akGet("stock_sy_hy_em", req, StockSyHyEmRes[].class);
    }

    public StockFhpsEmRes[] stockFhpsEm(StockFhpsEmReq req) {
        return akGet("stock_fhps_em", req, StockFhpsEmRes[].class);
    }

    public StockEbsLgRes[] stockEbsLg(StockEbsLgReq req) {
        return akGet("stock_ebs_lg", req, StockEbsLgRes[].class);
    }

    public StockAnalystDetailEmRes[] stockAnalystDetailEm(StockAnalystDetailEmReq req) {
        return akGet("stock_analyst_detail_em", req, StockAnalystDetailEmRes[].class);
    }

    public StockFinancialAbstractRes[] stockFinancialAbstract(StockFinancialAbstractReq req) {
        return akGet("stock_financial_abstract", req, StockFinancialAbstractRes[].class);
    }

    public StockReportFundHoldDetailRes[] stockReportFundHoldDetail(StockReportFundHoldDetailReq req) {
        return akGet("stock_report_fund_hold_detail", req, StockReportFundHoldDetailRes[].class);
    }

    public StockZhAAlertsClsRes[] stockZhAAlertsCls(StockZhAAlertsClsReq req) {
        return akGet("stock_zh_a_alerts_cls", req, StockZhAAlertsClsRes[].class);
    }

    public StockGpzyDistributeStatisticsBankEmRes[] stockGpzyDistributeStatisticsBankEm(StockGpzyDistributeStatisticsBankEmReq req) {
        return akGet("stock_gpzy_distribute_statistics_bank_em", req, StockGpzyDistributeStatisticsBankEmRes[].class);
    }

    public StockFinancialReportSinaRes[] stockFinancialReportSina(StockFinancialReportSinaReq req) {
        return akGet("stock_financial_report_sina", req, StockFinancialReportSinaRes[].class);
    }

    public StockBoardIndustryConsEmRes[] stockBoardIndustryConsEm(StockBoardIndustryConsEmReq req) {
        return akGet("stock_board_industry_cons_em", req, StockBoardIndustryConsEmRes[].class);
    }

    public StockBoardConceptConsThsRes[] stockBoardConceptConsThs(StockBoardConceptConsThsReq req) {
        return akGet("stock_board_concept_cons_ths", req, StockBoardConceptConsThsRes[].class);
    }

    public StockHkGxlLgRes[] stockHkGxlLg(StockHkGxlLgReq req) {
        return akGet("stock_hk_gxl_lg", req, StockHkGxlLgRes[].class);
    }

    public StockNewIpoCninfoRes[] stockNewIpoCninfo(StockNewIpoCninfoReq req) {
        return akGet("stock_new_ipo_cninfo", req, StockNewIpoCninfoRes[].class);
    }

    public StockHotRankDetailRealtimeEmRes[] stockHotRankDetailRealtimeEm(StockHotRankDetailRealtimeEmReq req) {
        return akGet("stock_hot_rank_detail_realtime_em", req, StockHotRankDetailRealtimeEmRes[].class);
    }

    public StockCommentDetailScrdCostEmRes[] stockCommentDetailScrdCostEm(StockCommentDetailScrdCostEmReq req) {
        return akGet("stock_comment_detail_scrd_cost_em", req, StockCommentDetailScrdCostEmRes[].class);
    }

    public StockHkHistRes[] stockHkHist(StockHkHistReq req) {
        return akGet("stock_hk_hist", req, StockHkHistRes[].class);
    }

    public StockUsHistFuRes[] stockUsHistFu(StockUsHistFuReq req) {
        return akGet("stock_us_hist_fu", req, StockUsHistFuRes[].class);
    }

    public StockHkSpotRes[] stockHkSpot(StockHkSpotReq req) {
        return akGet("stock_hk_spot", req, StockHkSpotRes[].class);
    }

    public StockGdfxHoldingStatisticsEmRes[] stockGdfxHoldingStatisticsEm(StockGdfxHoldingStatisticsEmReq req) {
        return akGet("stock_gdfx_holding_statistics_em", req, StockGdfxHoldingStatisticsEmRes[].class);
    }

    public StockZhAStopEmRes[] stockZhAStopEm(StockZhAStopEmReq req) {
        return akGet("stock_zh_a_stop_em", req, StockZhAStopEmRes[].class);
    }

    public StockBoardIndustryIndexThsRes[] stockBoardIndustryIndexThs(StockBoardIndustryIndexThsReq req) {
        return akGet("stock_board_industry_index_ths", req, StockBoardIndustryIndexThsRes[].class);
    }

    public StockHotDealXqRes[] stockHotDealXq(StockHotDealXqReq req) {
        return akGet("stock_hot_deal_xq", req, StockHotDealXqRes[].class);
    }

    public StockYjbbEmRes[] stockYjbbEm(StockYjbbEmReq req) {
        return akGet("stock_yjbb_em", req, StockYjbbEmRes[].class);
    }

    public StockATtmLyrRes[] stockATtmLyr(StockATtmLyrReq req) {
        return akGet("stock_a_ttm_lyr", req, StockATtmLyrRes[].class);
    }

    public StockInnerTradeXqRes[] stockInnerTradeXq(StockInnerTradeXqReq req) {
        return akGet("stock_inner_trade_xq", req, StockInnerTradeXqRes[].class);
    }

    public StockZhADailyRes[] stockZhADaily(StockZhADailyReq req) {
        return akGet("stock_zh_a_daily", req, StockZhADailyRes[].class);
    }

    public StockBoardIndustryHistEmRes[] stockBoardIndustryHistEm(StockBoardIndustryHistEmReq req) {
        return akGet("stock_board_industry_hist_em", req, StockBoardIndustryHistEmRes[].class);
    }

    public StockFinancialAbstractThsRes[] stockFinancialAbstractThs(StockFinancialAbstractThsReq req) {
        return akGet("stock_financial_abstract_ths", req, StockFinancialAbstractThsRes[].class);
    }

    public StockBoardIndustryHistMinEmRes[] stockBoardIndustryHistMinEm(StockBoardIndustryHistMinEmReq req) {
        return akGet("stock_board_industry_hist_min_em", req, StockBoardIndustryHistMinEmRes[].class);
    }

    public StockZhAhNameRes[] stockZhAhName(StockZhAhNameReq req) {
        return akGet("stock_zh_ah_name", req, StockZhAhNameRes[].class);
    }

    public StockHkHistMinEmRes[] stockHkHistMinEm(StockHkHistMinEmReq req) {
        return akGet("stock_hk_hist_min_em", req, StockHkHistMinEmRes[].class);
    }

    public StockZtPoolZbgcEmRes[] stockZtPoolZbgcEm(StockZtPoolZbgcEmReq req) {
        return akGet("stock_zt_pool_zbgc_em", req, StockZtPoolZbgcEmRes[].class);
    }

    public StockGdfxFreeHoldingTeamworkEmRes[] stockGdfxFreeHoldingTeamworkEm(StockGdfxFreeHoldingTeamworkEmReq req) {
        return akGet("stock_gdfx_free_holding_teamwork_em", req, StockGdfxFreeHoldingTeamworkEmRes[].class);
    }

    public StockGgcgEmRes[] stockGgcgEm(StockGgcgEmReq req) {
        return akGet("stock_ggcg_em", req, StockGgcgEmRes[].class);
    }

    public StockHotRankRelateEmRes[] stockHotRankRelateEm(StockHotRankRelateEmReq req) {
        return akGet("stock_hot_rank_relate_em", req, StockHotRankRelateEmRes[].class);
    }

    public StockGpzyPledgeRatioEmRes[] stockGpzyPledgeRatioEm(StockGpzyPledgeRatioEmReq req) {
        return akGet("stock_gpzy_pledge_ratio_em", req, StockGpzyPledgeRatioEmRes[].class);
    }

    public StockAIndicatorLgRes[] stockAIndicatorLg(StockAIndicatorLgReq req) {
        return akGet("stock_a_indicator_lg", req, StockAIndicatorLgRes[].class);
    }

    public StockReportFundHoldRes[] stockReportFundHold(StockReportFundHoldReq req) {
        return akGet("stock_report_fund_hold", req, StockReportFundHoldRes[].class);
    }

    public StockInstituteRecommendDetailRes[] stockInstituteRecommendDetail(StockInstituteRecommendDetailReq req) {
        return akGet("stock_institute_recommend_detail", req, StockInstituteRecommendDetailRes[].class);
    }

    public StockProfitForecastEmRes[] stockProfitForecastEm(StockProfitForecastEmReq req) {
        return akGet("stock_profit_forecast_em", req, StockProfitForecastEmRes[].class);
    }

    public StockLhbStockDetailEmRes[] stockLhbStockDetailEm(StockLhbStockDetailEmReq req) {
        return akGet("stock_lhb_stock_detail_em", req, StockLhbStockDetailEmRes[].class);
    }

    public StockHsgtHistEmRes[] stockHsgtHistEm(StockHsgtHistEmReq req) {
        return akGet("stock_hsgt_hist_em", req, StockHsgtHistEmRes[].class);
    }

    public StockGdfxFreeHoldingChangeEmRes[] stockGdfxFreeHoldingChangeEm(StockGdfxFreeHoldingChangeEmReq req) {
        return akGet("stock_gdfx_free_holding_change_em", req, StockGdfxFreeHoldingChangeEmRes[].class);
    }

    public StockHkHotRankDetailRealtimeEmRes[] stockHkHotRankDetailRealtimeEm(StockHkHotRankDetailRealtimeEmReq req) {
        return akGet("stock_hk_hot_rank_detail_realtime_em", req, StockHkHotRankDetailRealtimeEmRes[].class);
    }

    public StockHkSpotEmRes[] stockHkSpotEm(StockHkSpotEmReq req) {
        return akGet("stock_hk_spot_em", req, StockHkSpotEmRes[].class);
    }

    public StockShareChangeCninfoRes[] stockShareChangeCninfo(StockShareChangeCninfoReq req) {
        return akGet("stock_share_change_cninfo", req, StockShareChangeCninfoRes[].class);
    }

    public StockLhYybControlRes[] stockLhYybControl(StockLhYybControlReq req) {
        return akGet("stock_lh_yyb_control", req, StockLhYybControlRes[].class);
    }

    public StockBoardConceptNameEmRes[] stockBoardConceptNameEm(StockBoardConceptNameEmReq req) {
        return akGet("stock_board_concept_name_em", req, StockBoardConceptNameEmRes[].class);
    }

    public StockZtPoolPreviousEmRes[] stockZtPoolPreviousEm(StockZtPoolPreviousEmReq req) {
        return akGet("stock_zt_pool_previous_em", req, StockZtPoolPreviousEmRes[].class);
    }

    public StockBoardIndustryNameEmRes[] stockBoardIndustryNameEm(StockBoardIndustryNameEmReq req) {
        return akGet("stock_board_industry_name_em", req, StockBoardIndustryNameEmRes[].class);
    }

    public StockPriceJsRes[] stockPriceJs(StockPriceJsReq req) {
        return akGet("stock_price_js", req, StockPriceJsRes[].class);
    }

    public StockMainStockHolderRes[] stockMainStockHolder(StockMainStockHolderReq req) {
        return akGet("stock_main_stock_holder", req, StockMainStockHolderRes[].class);
    }

    public StockAccountStatisticsEmRes[] stockAccountStatisticsEm(StockAccountStatisticsEmReq req) {
        return akGet("stock_account_statistics_em", req, StockAccountStatisticsEmRes[].class);
    }

    public StockDzjyYybphRes[] stockDzjyYybph(StockDzjyYybphReq req) {
        return akGet("stock_dzjy_yybph", req, StockDzjyYybphRes[].class);
    }

    public StockBoardIndustryConsThsRes[] stockBoardIndustryConsThs(StockBoardIndustryConsThsReq req) {
        return akGet("stock_board_industry_cons_ths", req, StockBoardIndustryConsThsRes[].class);
    }

    public StockHoldNumCninfoRes[] stockHoldNumCninfo(StockHoldNumCninfoReq req) {
        return akGet("stock_hold_num_cninfo", req, StockHoldNumCninfoRes[].class);
    }

    public StockZhAHistRes[] stockZhAHist(StockZhAHistReq req) {
        return akGet("stock_zh_a_hist", req, StockZhAHistRes[].class);
    }

    public StockLhbGgtjSinaRes[] stockLhbGgtjSina(StockLhbGgtjSinaReq req) {
        return akGet("stock_lhb_ggtj_sina", req, StockLhbGgtjSinaRes[].class);
    }

    public StockZygcYmRes[] stockZygcYm(StockZygcYmReq req) {
        return akGet("stock_zygc_ym", req, StockZygcYmRes[].class);
    }

    public StockInstituteHoldDetailRes[] stockInstituteHoldDetail(StockInstituteHoldDetailReq req) {
        return akGet("stock_institute_hold_detail", req, StockInstituteHoldDetailRes[].class);
    }

    public StockHsgtNorthNetFlowInEmRes[] stockHsgtNorthNetFlowInEm(StockHsgtNorthNetFlowInEmReq req) {
        return akGet("stock_hsgt_north_net_flow_in_em", req, StockHsgtNorthNetFlowInEmRes[].class);
    }

    public StockDzjyMrmxRes[] stockDzjyMrmx(StockDzjyMrmxReq req) {
        return akGet("stock_dzjy_mrmx", req, StockDzjyMrmxRes[].class);
    }

    public StockNewsEmRes[] stockNewsEm(StockNewsEmReq req) {
        return akGet("stock_news_em", req, StockNewsEmRes[].class);
    }

    public StockLhbStockStatisticEmRes[] stockLhbStockStatisticEm(StockLhbStockStatisticEmReq req) {
        return akGet("stock_lhb_stock_statistic_em", req, StockLhbStockStatisticEmRes[].class);
    }

    public StockIndustryChangeCninfoRes[] stockIndustryChangeCninfo(StockIndustryChangeCninfoReq req) {
        return akGet("stock_industry_change_cninfo", req, StockIndustryChangeCninfoRes[].class);
    }

    public StockShASpotEmRes[] stockShASpotEm(StockShASpotEmReq req) {
        return akGet("stock_sh_a_spot_em", req, StockShASpotEmRes[].class);
    }

    public StockZhIndexDailyTxRes[] stockZhIndexDailyTx(StockZhIndexDailyTxReq req) {
        return akGet("stock_zh_index_daily_tx", req, StockZhIndexDailyTxRes[].class);
    }

    public StockLrbEmRes[] stockLrbEm(StockLrbEmReq req) {
        return akGet("stock_lrb_em", req, StockLrbEmRes[].class);
    }

    public StockZhASpotRes[] stockZhASpot(StockZhASpotReq req) {
        return akGet("stock_zh_a_spot", req, StockZhASpotRes[].class);
    }

    public StockRankCxslThsRes[] stockRankCxslThs(StockRankCxslThsReq req) {
        return akGet("stock_rank_cxsl_ths", req, StockRankCxslThsRes[].class);
    }

    public StockCirculateStockHolderRes[] stockCirculateStockHolder(StockCirculateStockHolderReq req) {
        return akGet("stock_circulate_stock_holder", req, StockCirculateStockHolderRes[].class);
    }

    public StockZhBDailyRes[] stockZhBDaily(StockZhBDailyReq req) {
        return akGet("stock_zh_b_daily", req, StockZhBDailyRes[].class);
    }

    public StockZyjsThsRes[] stockZyjsThs(StockZyjsThsReq req) {
        return akGet("stock_zyjs_ths", req, StockZyjsThsRes[].class);
    }

    public StockLhYybMostRes[] stockLhYybMost(StockLhYybMostReq req) {
        return akGet("stock_lh_yyb_most", req, StockLhYybMostRes[].class);
    }

    public StockGdfxHoldingDetailEmRes[] stockGdfxHoldingDetailEm(StockGdfxHoldingDetailEmReq req) {
        return akGet("stock_gdfx_holding_detail_em", req, StockGdfxHoldingDetailEmRes[].class);
    }

    public StockZhAStEmRes[] stockZhAStEm(StockZhAStEmReq req) {
        return akGet("stock_zh_a_st_em", req, StockZhAStEmRes[].class);
    }

    public StockDzjyHygtjRes[] stockDzjyHygtj(StockDzjyHygtjReq req) {
        return akGet("stock_dzjy_hygtj", req, StockDzjyHygtjRes[].class);
    }

    public StockMarketPbLgRes[] stockMarketPbLg(StockMarketPbLgReq req) {
        return akGet("stock_market_pb_lg", req, StockMarketPbLgRes[].class);
    }

    public StockAveragePositionLeguRes[] stockAveragePositionLegu(StockAveragePositionLeguReq req) {
        return akGet("stock_average_position_legu", req, StockAveragePositionLeguRes[].class);
    }

    public StockFundFlowIndustryRes[] stockFundFlowIndustry(StockFundFlowIndustryReq req) {
        return akGet("stock_fund_flow_industry", req, StockFundFlowIndustryRes[].class);
    }

    public StockBoardConceptHistMinEmRes[] stockBoardConceptHistMinEm(StockBoardConceptHistMinEmReq req) {
        return akGet("stock_board_concept_hist_min_em", req, StockBoardConceptHistMinEmRes[].class);
    }

    public StockSectorSpotRes[] stockSectorSpot(StockSectorSpotReq req) {
        return akGet("stock_sector_spot", req, StockSectorSpotRes[].class);
    }

    public StockInfoShNameCodeRes[] stockInfoShNameCode(StockInfoShNameCodeReq req) {
        return akGet("stock_info_sh_name_code", req, StockInfoShNameCodeRes[].class);
    }

    public StockSgtSettlementExchangeRateSzseRes[] stockSgtSettlementExchangeRateSzse(StockSgtSettlementExchangeRateSzseReq req) {
        return akGet("stock_sgt_settlement_exchange_rate_szse", req, StockSgtSettlementExchangeRateSzseRes[].class);
    }

    public StockRankLxxdThsRes[] stockRankLxxdThs(StockRankLxxdThsReq req) {
        return akGet("stock_rank_lxxd_ths", req, StockRankLxxdThsRes[].class);
    }

    public StockIndividualFundFlowRankRes[] stockIndividualFundFlowRank(StockIndividualFundFlowRankReq req) {
        return akGet("stock_individual_fund_flow_rank", req, StockIndividualFundFlowRankRes[].class);
    }

    public StockABelowNetAssetStatisticsRes[] stockABelowNetAssetStatistics(StockABelowNetAssetStatisticsReq req) {
        return akGet("stock_a_below_net_asset_statistics", req, StockABelowNetAssetStatisticsRes[].class);
    }

    public StockHkMainBoardSpotEmRes[] stockHkMainBoardSpotEm(StockHkMainBoardSpotEmReq req) {
        return akGet("stock_hk_main_board_spot_em", req, StockHkMainBoardSpotEmRes[].class);
    }

    public StockSyYqEmRes[] stockSyYqEm(StockSyYqEmReq req) {
        return akGet("stock_sy_yq_em", req, StockSyYqEmRes[].class);
    }

    public StockHkValuationBaiduRes[] stockHkValuationBaidu(StockHkValuationBaiduReq req) {
        return akGet("stock_hk_valuation_baidu", req, StockHkValuationBaiduRes[].class);
    }

    public StockLhbJgmxSinaRes[] stockLhbJgmxSina(StockLhbJgmxSinaReq req) {
        return akGet("stock_lhb_jgmx_sina", req, StockLhbJgmxSinaRes[].class);
    }

    public StockHistoryDividendDetailRes[] stockHistoryDividendDetail(StockHistoryDividendDetailReq req) {
        return akGet("stock_history_dividend_detail", req, StockHistoryDividendDetailRes[].class);
    }

    public StockIndustryPeRatioCninfoRes[] stockIndustryPeRatioCninfo(StockIndustryPeRatioCninfoReq req) {
        return akGet("stock_industry_pe_ratio_cninfo", req, StockIndustryPeRatioCninfoRes[].class);
    }

    public StockHotRankEmRes[] stockHotRankEm(StockHotRankEmReq req) {
        return akGet("stock_hot_rank_em", req, StockHotRankEmRes[].class);
    }

    public StockSectorFundFlowSummaryRes[] stockSectorFundFlowSummary(StockSectorFundFlowSummaryReq req) {
        return akGet("stock_sector_fund_flow_summary", req, StockSectorFundFlowSummaryRes[].class);
    }

    public StockYysjEmRes[] stockYysjEm(StockYysjEmReq req) {
        return akGet("stock_yysj_em", req, StockYysjEmRes[].class);
    }

    public StockAGxlLgRes[] stockAGxlLg(StockAGxlLgReq req) {
        return akGet("stock_a_gxl_lg", req, StockAGxlLgRes[].class);
    }

    public StockHsgtStockStatisticsEmRes[] stockHsgtStockStatisticsEm(StockHsgtStockStatisticsEmReq req) {
        return akGet("stock_hsgt_stock_statistics_em", req, StockHsgtStockStatisticsEmRes[].class);
    }

    public StockHsgtIndividualEmRes[] stockHsgtIndividualEm(StockHsgtIndividualEmReq req) {
        return akGet("stock_hsgt_individual_em", req, StockHsgtIndividualEmRes[].class);
    }

    public StockStaqNetStopRes[] stockStaqNetStop(StockStaqNetStopReq req) {
        return akGet("stock_staq_net_stop", req, StockStaqNetStopRes[].class);
    }

    public StockRestrictedReleaseQueueEmRes[] stockRestrictedReleaseQueueEm(StockRestrictedReleaseQueueEmReq req) {
        return akGet("stock_restricted_release_queue_em", req, StockRestrictedReleaseQueueEmRes[].class);
    }

    public StockDividentsCninfoRes[] stockDividentsCninfo(StockDividentsCninfoReq req) {
        return akGet("stock_dividents_cninfo", req, StockDividentsCninfoRes[].class);
    }

    public StockHkHotRankDetailEmRes[] stockHkHotRankDetailEm(StockHkHotRankDetailEmReq req) {
        return akGet("stock_hk_hot_rank_detail_em", req, StockHkHotRankDetailEmRes[].class);
    }

    public StockIpoDeclareRes[] stockIpoDeclare(StockIpoDeclareReq req) {
        return akGet("stock_ipo_declare", req, StockIpoDeclareRes[].class);
    }

    public StockRankLxszThsRes[] stockRankLxszThs(StockRankLxszThsReq req) {
        return akGet("stock_rank_lxsz_ths", req, StockRankLxszThsRes[].class);
    }

    public StockInfoChangeNameRes[] stockInfoChangeName(StockInfoChangeNameReq req) {
        return akGet("stock_info_change_name", req, StockInfoChangeNameRes[].class);
    }

    public StockHotRankWcRes[] stockHotRankWc(StockHotRankWcReq req) {
        return akGet("stock_hot_rank_wc", req, StockHotRankWcRes[].class);
    }

    public StockZhAhSpotRes[] stockZhAhSpot(StockZhAhSpotReq req) {
        return akGet("stock_zh_ah_spot", req, StockZhAhSpotRes[].class);
    }

    public StockBoardConsThsRes[] stockBoardConsThs(StockBoardConsThsReq req) {
        return akGet("stock_board_cons_ths", req, StockBoardConsThsRes[].class);
    }

    public StockZhBSpotEmRes[] stockZhBSpotEm(StockZhBSpotEmReq req) {
        return akGet("stock_zh_b_spot_em", req, StockZhBSpotEmRes[].class);
    }

    public StockAnalystRankEmRes[] stockAnalystRankEm(StockAnalystRankEmReq req) {
        return akGet("stock_analyst_rank_em", req, StockAnalystRankEmRes[].class);
    }

    public StockNoticeReportRes[] stockNoticeReport(StockNoticeReportReq req) {
        return akGet("stock_notice_report", req, StockNoticeReportRes[].class);
    }

    public StockZhKcbReportEmRes[] stockZhKcbReportEm(StockZhKcbReportEmReq req) {
        return akGet("stock_zh_kcb_report_em", req, StockZhKcbReportEmRes[].class);
    }

    public StockSgtReferenceExchangeRateSseRes[] stockSgtReferenceExchangeRateSse(StockSgtReferenceExchangeRateSseReq req) {
        return akGet("stock_sgt_reference_exchange_rate_sse", req, StockSgtReferenceExchangeRateSseRes[].class);
    }

    public StockSectorDetailRes[] stockSectorDetail(StockSectorDetailReq req) {
        return akGet("stock_sector_detail", req, StockSectorDetailRes[].class);
    }

    public StockSseDealDailyRes[] stockSseDealDaily(StockSseDealDailyReq req) {
        return akGet("stock_sse_deal_daily", req, StockSseDealDailyRes[].class);
    }

    public StockFhpsDetailEmRes[] stockFhpsDetailEm(StockFhpsDetailEmReq req) {
        return akGet("stock_fhps_detail_em", req, StockFhpsDetailEmRes[].class);
    }

    public StockRankCxgThsRes[] stockRankCxgThs(StockRankCxgThsReq req) {
        return akGet("stock_rank_cxg_ths", req, StockRankCxgThsRes[].class);
    }

    public StockYzxdrEmRes[] stockYzxdrEm(StockYzxdrEmReq req) {
        return akGet("stock_yzxdr_em", req, StockYzxdrEmRes[].class);
    }

    public StockHotTweetXqRes[] stockHotTweetXq(StockHotTweetXqReq req) {
        return akGet("stock_hot_tweet_xq", req, StockHotTweetXqRes[].class);
    }

    public StockUsFamousSpotEmRes[] stockUsFamousSpotEm(StockUsFamousSpotEmReq req) {
        return akGet("stock_us_famous_spot_em", req, StockUsFamousSpotEmRes[].class);
    }

    public StockJgdyDetailEmRes[] stockJgdyDetailEm(StockJgdyDetailEmReq req) {
        return akGet("stock_jgdy_detail_em", req, StockJgdyDetailEmRes[].class);
    }

    public StockRegisterKcbRes[] stockRegisterKcb(StockRegisterKcbReq req) {
        return akGet("stock_register_kcb", req, StockRegisterKcbRes[].class);
    }

    public StockIndexPeLgRes[] stockIndexPeLg(StockIndexPeLgReq req) {
        return akGet("stock_index_pe_lg", req, StockIndexPeLgRes[].class);
    }

    public StockCgGuaranteeCninfoRes[] stockCgGuaranteeCninfo(StockCgGuaranteeCninfoReq req) {
        return akGet("stock_cg_guarantee_cninfo", req, StockCgGuaranteeCninfoRes[].class);
    }

    public StockBoardIndustrySummaryThsRes[] stockBoardIndustrySummaryThs(StockBoardIndustrySummaryThsReq req) {
        return akGet("stock_board_industry_summary_ths", req, StockBoardIndustrySummaryThsRes[].class);
    }

    public StockHotSearchBaiduRes[] stockHotSearchBaidu(StockHotSearchBaiduReq req) {
        return akGet("stock_hot_search_baidu", req, StockHotSearchBaiduRes[].class);
    }

    public StockSzseSectorSummaryRes[] stockSzseSectorSummary(StockSzseSectorSummaryReq req) {
        return akGet("stock_szse_sector_summary", req, StockSzseSectorSummaryRes[].class);
    }

    public StockMarketActivityLeguRes[] stockMarketActivityLegu(StockMarketActivityLeguReq req) {
        return akGet("stock_market_activity_legu", req, StockMarketActivityLeguRes[].class);
    }

    public StockMdaYmRes[] stockMdaYm(StockMdaYmReq req) {
        return akGet("stock_mda_ym", req, StockMdaYmRes[].class);
    }

    public StockZhAGdhsRes[] stockZhAGdhs(StockZhAGdhsReq req) {
        return akGet("stock_zh_a_gdhs", req, StockZhAGdhsRes[].class);
    }

    public StockHotFollowXqRes[] stockHotFollowXq(StockHotFollowXqReq req) {
        return akGet("stock_hot_follow_xq", req, StockHotFollowXqRes[].class);
    }

    public StockUsDailyRes[] stockUsDaily(StockUsDailyReq req) {
        return akGet("stock_us_daily", req, StockUsDailyRes[].class);
    }

    public StockBidAskEmRes[] stockBidAskEm(StockBidAskEmReq req) {
        return akGet("stock_bid_ask_em", req, StockBidAskEmRes[].class);
    }

    public StockCommentDetailScrdDesireEmRes[] stockCommentDetailScrdDesireEm(StockCommentDetailScrdDesireEmReq req) {
        return akGet("stock_comment_detail_scrd_desire_em", req, StockCommentDetailScrdDesireEmRes[].class);
    }

    public StockPgEmRes[] stockPgEm(StockPgEmReq req) {
        return akGet("stock_pg_em", req, StockPgEmRes[].class);
    }

    public StockBoardConceptHistEmRes[] stockBoardConceptHistEm(StockBoardConceptHistEmReq req) {
        return akGet("stock_board_concept_hist_em", req, StockBoardConceptHistEmRes[].class);
    }

    public StockHkGgtComponentsEmRes[] stockHkGgtComponentsEm(StockHkGgtComponentsEmReq req) {
        return akGet("stock_hk_ggt_components_em", req, StockHkGgtComponentsEmRes[].class);
    }

    public StockZhANewEmRes[] stockZhANewEm(StockZhANewEmReq req) {
        return akGet("stock_zh_a_new_em", req, StockZhANewEmRes[].class);
    }

    public StockRankXxtpThsRes[] stockRankXxtpThs(StockRankXxtpThsReq req) {
        return akGet("stock_rank_xxtp_ths", req, StockRankXxtpThsRes[].class);
    }

    public StockHoldManagementDetailCninfoRes[] stockHoldManagementDetailCninfo(StockHoldManagementDetailCninfoReq req) {
        return akGet("stock_hold_management_detail_cninfo", req, StockHoldManagementDetailCninfoRes[].class);
    }

    public StockGdfxTop10EmRes[] stockGdfxTop10Em(StockGdfxTop10EmReq req) {
        return akGet("stock_gdfx_top_10_em", req, StockGdfxTop10EmRes[].class);
    }

    public StockZtPoolDtgcEmRes[] stockZtPoolDtgcEm(StockZtPoolDtgcEmReq req) {
        return akGet("stock_zt_pool_dtgc_em", req, StockZtPoolDtgcEmRes[].class);
    }


    @Autowired
    private RestTemplate restTemplate;
    @Value("${ak.baseUrl}/api/public/")
    private String akPublicUrl;

    private <T> T akGet(String apiName, Object req, Class<T> resType) {
        UriComponentsBuilder ucb = UriComponentsBuilder.fromUriString(akPublicUrl).path(apiName);
        Field[] declaredFields = req.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            try {
                // 获取注解
                AkParam annotation = declaredField.getAnnotation(AkParam.class);
                if (annotation != null) {
                    if (StringUtils.hasText(annotation.value())) {
                        ucb.queryParam(annotation.value(), declaredField.get(req));
                    } else {
                        ucb.queryParam(declaredField.getName(), declaredField.get(req));
                    }
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        String uriString = ucb.build().toUriString();
        return restTemplate.getForObject(uriString, resType);
    }

}
