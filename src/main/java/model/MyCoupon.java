package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by huangbingjing on 17/8/8.
 */
public class MyCoupon {

	private Long id;

    private Long userId;

    private String code;

	private Integer type;

	private BigDecimal value;

	private Integer isEnable;

	private Integer isUsed;

	private Date usedTime;

	private Date stopTime;

	private Integer moneyLimit;

	private Integer superposition;

	private String approachDesc;

	private Integer scope;

	private String expectLimitType;

	private String expectLimit;

	private String description;

	private Long ctId;

	private Integer temporaryUse;

	private Long payId;

	private Long orderId;

	private Integer version;

    private Date createTime;

    private Date updateTime;

	private String scopeVip;

	private String scopeSantou;

	private Integer isRead;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	public Integer getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}

	public Date getUsedTime() {
		return usedTime;
	}

	public void setUsedTime(Date usedTime) {
		this.usedTime = usedTime;
	}

	public Date getStopTime() {
		return stopTime;
	}

	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}

	public Integer getMoneyLimit() {
		return moneyLimit;
	}

	public void setMoneyLimit(Integer moneyLimit) {
		this.moneyLimit = moneyLimit;
	}

	public Integer getSuperposition() {
		return superposition;
	}

	public void setSuperposition(Integer superposition) {
		this.superposition = superposition;
	}

	public String getApproachDesc() {
		return approachDesc;
	}

	public void setApproachDesc(String approachDesc) {
		this.approachDesc = approachDesc;
	}

	public Integer getScope() {
		return scope;
	}

	public void setScope(Integer scope) {
		this.scope = scope;
	}

	public String getExpectLimitType() {
		return expectLimitType;
	}

	public void setExpectLimitType(String expectLimitType) {
		this.expectLimitType = expectLimitType;
	}

	public String getExpectLimit() {
		return expectLimit;
	}

	public void setExpectLimit(String expectLimit) {
		this.expectLimit = expectLimit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCtId() {
		return ctId;
	}

	public void setCtId(Long ctId) {
		this.ctId = ctId;
	}

	public Integer getTemporaryUse() {
		return temporaryUse;
	}

	public void setTemporaryUse(Integer temporaryUse) {
		this.temporaryUse = temporaryUse;
	}

	public Long getPayId() {
		return payId;
	}

	public void setPayId(Long payId) {
		this.payId = payId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getScopeVip() {
		return scopeVip;
	}

	public void setScopeVip(String scopeVip) {
		this.scopeVip = scopeVip;
	}

	public String getScopeSantou() {
		return scopeSantou;
	}

	public void setScopeSantou(String scopeSantou) {
		this.scopeSantou = scopeSantou;
	}

	public Integer getIsRead() {
		return isRead;
	}

	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("MyCoupon{");
		sb.append("id=").append(id);
		sb.append(", userId=").append(userId);
		sb.append(", code='").append(code).append('\'');
		sb.append(", type=").append(type);
		sb.append(", value=").append(value);
		sb.append(", isEnable=").append(isEnable);
		sb.append(", isUsed=").append(isUsed);
		sb.append(", usedTime=").append(usedTime);
		sb.append(", stopTime=").append(stopTime);
		sb.append(", moneyLimit=").append(moneyLimit);
		sb.append(", superposition=").append(superposition);
		sb.append(", approachDesc='").append(approachDesc).append('\'');
		sb.append(", scope=").append(scope);
		sb.append(", expectLimitType='").append(expectLimitType).append('\'');
		sb.append(", expectLimit='").append(expectLimit).append('\'');
		sb.append(", description='").append(description).append('\'');
		sb.append(", ctId=").append(ctId);
		sb.append(", temporaryUse=").append(temporaryUse);
		sb.append(", payId=").append(payId);
		sb.append(", orderId=").append(orderId);
		sb.append(", version=").append(version);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", scopeVip='").append(scopeVip).append('\'');
		sb.append(", scopeSantou='").append(scopeSantou).append('\'');
		sb.append(", isRead=").append(isRead);
		sb.append('}');
		return sb.toString();
	}
}
