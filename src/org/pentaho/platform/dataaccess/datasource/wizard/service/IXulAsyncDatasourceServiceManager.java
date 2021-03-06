package org.pentaho.platform.dataaccess.datasource.wizard.service;

import java.util.List;

import org.pentaho.platform.dataaccess.datasource.IDatasourceInfo;
import org.pentaho.ui.xul.XulServiceCallback;

import com.google.gwt.http.client.RequestCallback;

public interface IXulAsyncDatasourceServiceManager {

  void isAdmin(XulServiceCallback<Boolean> callback);
  void getAnalysisDatasourceIds(XulServiceCallback<List<String>> callback);
  void getMetadataDatasourceIds(XulServiceCallback<List<String>> callback);
  void getDSWDatasourceIds(XulServiceCallback<List<String>> callback);
  void export(IDatasourceInfo dsInfo);
  void remove(IDatasourceInfo dsInfo, Object callback);
}
