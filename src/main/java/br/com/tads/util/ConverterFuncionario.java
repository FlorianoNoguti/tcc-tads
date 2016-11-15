package br.com.tads.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.tads.dao.DAO;
import br.com.tads.modelo.Funcionario;


@FacesConverter("converterFuncionario")
public class ConverterFuncionario implements Converter{
		@Override
		public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
			if (value != null && value.trim().length() > 0) {
				try {
					DAO dao = new DAO(Funcionario.class);
					Object funcionario = dao.buscaPorId(Long.parseLong(value));
					return funcionario;
				} catch (NumberFormatException e) {
					throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro no converter funcionario",
							"Não é um funcionario válido"));
				}
			} else {
				return null;
			}
		}

		@Override
		public String getAsString(FacesContext fc, UIComponent uic, Object object) {
			if (object != null) {
				return String.valueOf(((Funcionario) object).getId());
			} else {
				return null;
			}
		}
}
