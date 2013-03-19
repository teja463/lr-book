/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.mpower.slayer.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.mpower.slayer.model.InvitationCard;
import com.mpower.slayer.model.InvitationCardModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the InvitationCard service. Represents a row in the &quot;mpower_InvitationCard&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.mpower.slayer.model.InvitationCardModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InvitationCardImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InvitationCardImpl
 * @see com.mpower.slayer.model.InvitationCard
 * @see com.mpower.slayer.model.InvitationCardModel
 * @generated
 */
public class InvitationCardModelImpl extends BaseModelImpl<InvitationCard>
	implements InvitationCardModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a invitation card model instance should use the {@link com.mpower.slayer.model.InvitationCard} interface instead.
	 */
	public static final String TABLE_NAME = "mpower_InvitationCard";
	public static final Object[][] TABLE_COLUMNS = {
			{ "invitationId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "inviteeEmail", Types.VARCHAR },
			{ "status", Types.INTEGER },
			{ "inviteeNewUserId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table mpower_InvitationCard (invitationId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,inviteeEmail VARCHAR(75) null,status INTEGER,inviteeNewUserId LONG)";
	public static final String TABLE_SQL_DROP = "drop table mpower_InvitationCard";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.mpower.slayer.model.InvitationCard"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.mpower.slayer.model.InvitationCard"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.mpower.slayer.model.InvitationCard"),
			true);
	public static long INVITEEEMAIL_COLUMN_BITMASK = 1L;
	public static long STATUS_COLUMN_BITMASK = 2L;
	public static long USERID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.mpower.slayer.model.InvitationCard"));

	public InvitationCardModelImpl() {
	}

	public long getPrimaryKey() {
		return _invitationId;
	}

	public void setPrimaryKey(long primaryKey) {
		setInvitationId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_invitationId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return InvitationCard.class;
	}

	public String getModelClassName() {
		return InvitationCard.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("invitationId", getInvitationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("inviteeEmail", getInviteeEmail());
		attributes.put("status", getStatus());
		attributes.put("inviteeNewUserId", getInviteeNewUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long invitationId = (Long)attributes.get("invitationId");

		if (invitationId != null) {
			setInvitationId(invitationId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String inviteeEmail = (String)attributes.get("inviteeEmail");

		if (inviteeEmail != null) {
			setInviteeEmail(inviteeEmail);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long inviteeNewUserId = (Long)attributes.get("inviteeNewUserId");

		if (inviteeNewUserId != null) {
			setInviteeNewUserId(inviteeNewUserId);
		}
	}

	public long getInvitationId() {
		return _invitationId;
	}

	public void setInvitationId(long invitationId) {
		_invitationId = invitationId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getInviteeEmail() {
		if (_inviteeEmail == null) {
			return StringPool.BLANK;
		}
		else {
			return _inviteeEmail;
		}
	}

	public void setInviteeEmail(String inviteeEmail) {
		_columnBitmask |= INVITEEEMAIL_COLUMN_BITMASK;

		if (_originalInviteeEmail == null) {
			_originalInviteeEmail = _inviteeEmail;
		}

		_inviteeEmail = inviteeEmail;
	}

	public String getOriginalInviteeEmail() {
		return GetterUtil.getString(_originalInviteeEmail);
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	public long getInviteeNewUserId() {
		return _inviteeNewUserId;
	}

	public void setInviteeNewUserId(long inviteeNewUserId) {
		_inviteeNewUserId = inviteeNewUserId;
	}

	public String getInviteeNewUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getInviteeNewUserId(), "uuid",
			_inviteeNewUserUuid);
	}

	public void setInviteeNewUserUuid(String inviteeNewUserUuid) {
		_inviteeNewUserUuid = inviteeNewUserUuid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			InvitationCard.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public InvitationCard toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (InvitationCard)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		InvitationCardImpl invitationCardImpl = new InvitationCardImpl();

		invitationCardImpl.setInvitationId(getInvitationId());
		invitationCardImpl.setCompanyId(getCompanyId());
		invitationCardImpl.setGroupId(getGroupId());
		invitationCardImpl.setUserId(getUserId());
		invitationCardImpl.setUserName(getUserName());
		invitationCardImpl.setCreateDate(getCreateDate());
		invitationCardImpl.setModifiedDate(getModifiedDate());
		invitationCardImpl.setInviteeEmail(getInviteeEmail());
		invitationCardImpl.setStatus(getStatus());
		invitationCardImpl.setInviteeNewUserId(getInviteeNewUserId());

		invitationCardImpl.resetOriginalValues();

		return invitationCardImpl;
	}

	public int compareTo(InvitationCard invitationCard) {
		long primaryKey = invitationCard.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		InvitationCard invitationCard = null;

		try {
			invitationCard = (InvitationCard)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = invitationCard.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		InvitationCardModelImpl invitationCardModelImpl = this;

		invitationCardModelImpl._originalUserId = invitationCardModelImpl._userId;

		invitationCardModelImpl._setOriginalUserId = false;

		invitationCardModelImpl._originalInviteeEmail = invitationCardModelImpl._inviteeEmail;

		invitationCardModelImpl._originalStatus = invitationCardModelImpl._status;

		invitationCardModelImpl._setOriginalStatus = false;

		invitationCardModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<InvitationCard> toCacheModel() {
		InvitationCardCacheModel invitationCardCacheModel = new InvitationCardCacheModel();

		invitationCardCacheModel.invitationId = getInvitationId();

		invitationCardCacheModel.companyId = getCompanyId();

		invitationCardCacheModel.groupId = getGroupId();

		invitationCardCacheModel.userId = getUserId();

		invitationCardCacheModel.userName = getUserName();

		String userName = invitationCardCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			invitationCardCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			invitationCardCacheModel.createDate = createDate.getTime();
		}
		else {
			invitationCardCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			invitationCardCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			invitationCardCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		invitationCardCacheModel.inviteeEmail = getInviteeEmail();

		String inviteeEmail = invitationCardCacheModel.inviteeEmail;

		if ((inviteeEmail != null) && (inviteeEmail.length() == 0)) {
			invitationCardCacheModel.inviteeEmail = null;
		}

		invitationCardCacheModel.status = getStatus();

		invitationCardCacheModel.inviteeNewUserId = getInviteeNewUserId();

		return invitationCardCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{invitationId=");
		sb.append(getInvitationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", inviteeEmail=");
		sb.append(getInviteeEmail());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", inviteeNewUserId=");
		sb.append(getInviteeNewUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.mpower.slayer.model.InvitationCard");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>invitationId</column-name><column-value><![CDATA[");
		sb.append(getInvitationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inviteeEmail</column-name><column-value><![CDATA[");
		sb.append(getInviteeEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inviteeNewUserId</column-name><column-value><![CDATA[");
		sb.append(getInviteeNewUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = InvitationCard.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			InvitationCard.class
		};
	private long _invitationId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _inviteeEmail;
	private String _originalInviteeEmail;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _inviteeNewUserId;
	private String _inviteeNewUserUuid;
	private long _columnBitmask;
	private InvitationCard _escapedModelProxy;
}